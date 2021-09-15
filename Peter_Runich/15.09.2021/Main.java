package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

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
        ArrayList<String> stringArray = new ArrayList();
        String userString;

        do {
            userString = scanner.nextLine();
            stringArray.add(userString);
        } while(!userString.equals("end"));

        stringArray.remove(stringArray.size() - 1);

        String allStrings = String.join("%n", stringArray);

        System.out.printf(allStrings + "%n");
    }

    public static void task2() {
        String[] stringArray = new String[10];

        for (int i = 0; i < 5; i++) {
            System.out.print(i + ": ");
            stringArray[i] = scanner.nextLine();
        }

        Main.doubleValues(stringArray);

        for (int i = 0; i < 10; i++) { System.out.println(stringArray[i]); }
    }

    public static void task3() {
        System.out.print("Сколько будет введено целых чисел? : ");
        System.out.println("Минимальное число: " + Main.getMinimum(Main.getIntegerList(scanner.nextInt(), scanner)));
    }

    public static LinkedList<Integer> getIntegerList(Integer numberOfNumbers, Scanner scanner) {
        LinkedList<Integer> numbersList = new LinkedList<Integer>();
        int userNumber;

        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.printf("Целое число %d: ", i);

            userNumber = scanner.nextInt();

            if ((userNumber & 1) != 0) {
                System.out.println("Вы ввели нечётное число.");
                System.exit(0);
            }

            numbersList.add(userNumber);
        }

        return numbersList;
    }

    public static int getMinimum(LinkedList<Integer> array) {
        int min = array.getFirst();

        for (int i = 1; i < array.size(); i++) {
            min = (min > array.get(i)) ? array.get(i) : min;
        }

        return min;
    }

    public static void doubleValues(String[] array) {
        for (int i = 4; i >= 0; i--) {
            array[i * 2] = array[i];
            array[i * 2 + 1] = array[i];
        }
    }
}
