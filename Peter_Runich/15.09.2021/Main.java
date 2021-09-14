package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
    }

    public static void task1() {
        Scanner s = new Scanner(System.in);
        ArrayList<String> stringArray = new ArrayList();
        String userString;

        do {
            userString = s.nextLine();
            stringArray.add(userString);
        } while(!userString.equals("end"));

        stringArray.remove(stringArray.size() - 1);

        String allStrings = String.join("%n", stringArray);

        System.out.printf(allStrings);
    }

    public static void task2() {
        Scanner s = new Scanner(System.in);
        String[] stringArray = new String[10];

        for (int i = 0; i < 5; i++) {
            System.out.print(i + ": ");
            stringArray[i] = s.nextLine();
        }

        Main.doubleValues(stringArray);

        for (int i = 0; i < 10; i++) { System.out.println(stringArray[i]); }
    }

    public static void task3() {
        Scanner s = new Scanner(System.in);

        System.out.print("Сколько будет введено целых чисел? : ");
        System.out.println("Минимальное число: " + Main.getMinimum(Main.getIntegerList(s.nextInt(), s)));
    }

    public static LinkedList<Integer> getIntegerList(Integer numberOfNumbers, Scanner scanner) {
        LinkedList<Integer> numbersList = new LinkedList<Integer>();
        int userNumber;

        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.printf("Целое число %d: ", i);

            userNumber = scanner.nextInt();

            if ((userNumber & 1) != 0) { System.out.println("Вы ввели нечётное число."); System.exit(0); }

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
