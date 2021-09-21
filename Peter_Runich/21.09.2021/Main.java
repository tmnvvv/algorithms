package com.company;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("");
            System.out.println("1.Моя первая задача.");
            System.out.println("2.Моя вторая задача.");
            System.out.println("3.Моя третья задача.");
            System.out.println("0.Выход.");
            System.out.println("Введите номер задачи:");
            System.out.print("> ");
            int index = scanner.nextInt();
            switch (index) {
                case 0: {
                    System.exit(1);
                    break;
                }
                case 1: {
                    task1();
                    break;
                }
                case 2: {
                    task2();
                    break;
                }
                case 3: {
                    task3();
                    break;
                }
                default: {
                    System.out.println("Такой задачи нет!");
                    break;
                }
            }
        }
    }

    public static void task1() {
        System.out.println("Введите размерность массива.");
        int count = scanner.nextInt();

        CustomerArray customerArray = new CustomerArray(count);

        System.out.println("ARRAY: " + Arrays.toString(customerArray.array));
        System.out.println("MAX: " + customerArray.max());
        System.out.println("MIN: " + customerArray.min());
        System.out.println("SUM: " + customerArray.sum());
        System.out.println("AVG: " + customerArray.avg());
        System.out.println("ODDS: " + Arrays.toString(customerArray.odds()));
    }

    public static void task2() {
        int[] array = {0,1,2,3,4,5,6,7,8,9};

        System.out.println("ARRAY: " + Arrays.toString(array));

        System.out.println("Введите индекс.");
        int index = scanner.nextInt();

        System.out.println("Введите размерность массива.");
        int count = scanner.nextInt();

        String myReverse = Arrays.toString(ReversedArray.myReverse(array));
        String subArray = Arrays.toString(ReversedArray.subArray(array, index, count));
        System.out.println("myReverse: " + myReverse);
        System.out.println("subArray: "  + subArray);
    }

    public static void task3() {
        int[] array = {0,1,2,3,4,5,6,7,8,9};

        System.out.println("Введите число.");
        int number = scanner.nextInt();

        String result = Arrays.toString(UserArray.addPlusOneElement(array, number));
        System.out.println("RESULT: "  + result);
    }
}

class CustomerArray {
    public int[] array;

    CustomerArray(int count) {
        array = new int[count];

        fillArrayWithRandomNumbers();
    }

    public void fillArrayWithRandomNumbers() {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(50);
        }
    }

    public int max() {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
    public int min() {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
    public int sum() {
        int sum = array[0];

        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
    public int avg() {
        return sum() / array.length;
    }
    public int[] odds() {
        List<Integer> odds = new ArrayList<>();
        int[] oddsArray;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) != 0) { odds.add(array[i]); }
        }

        oddsArray = new int[odds.size()];

        for (int i = 0; i < odds.size(); i++) {
            oddsArray[i] = odds.get(i);
        }

        return oddsArray;
    }
}

class ReversedArray {
    public static int[] myReverse(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[array.length - (i + 1)] = array[i];
        }

        return newArray;
    }

    public static int[] subArray(int[] array, int index, int count) {
        int[] newArray = new int[count];
        int newArrayIndex = 0;

        for (int i = index; i < (count + index); i++) {
            if (i < count - 1 ) {
                newArray[newArrayIndex] = array[i];
                newArrayIndex++;
            } else {
                newArray[newArrayIndex] = 1;
                newArrayIndex++;
            }
        }

        return newArray;
    }
}

class UserArray {
    public static int[] addPlusOneElement(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = value;

        for (int i = 1; i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }
}