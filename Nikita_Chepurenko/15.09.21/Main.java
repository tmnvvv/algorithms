package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NotMainNew tasks = new NotMainNew();
        System.out.println("Выполняется задание 1");
        tasks.taskNumberOne();
        System.out.println("Задание 1 выполнилось");
        System.out.println("\nВыполняется задание 2");
        tasks.taskNumberTwo();
        System.out.println("Задание 2 выполнилось");
        System.out.println("\nВыполняется задание 3");
        tasks.taskNumberThree();
        System.out.println("Задание 3 выполнилось");
    }
}
class NotMainNew {
    public void taskNumberOne() {
        /*
        Задача №1
        Вводить с клавиатуры строки, пока пользователь не введёт строку 'end':
        1. Создать список строк.
        2. Ввести строки с клавиатуры и добавить их в список.
        3. Вводить с клавиатуры строки, пока пользователь не введёт строку "end". "end" не учитывать.
        4. Вывести строки на экран, каждую с новой строки.
         */
        Scanner input = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        while (true) {
            String s = input.nextLine();
            if (s.equals("end"))
                break;
            array.add(s);
        }
        for (String let : array) {
            System.out.println(let);
        }
    }
    public void taskNumberTwo() {
        /*
         Задание 2
        Используя коллекцию удвойте слово:
        1. Введите с клавиатуры 5 слов в список строк.
        2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
        3. Используя цикл for выведите результат на экран, каждое значение с новой строки.
         */
        Scanner input = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            String s = input.nextLine();
            array.add(s);
        }
        ArrayList<String> newArray = new ArrayList<String>();
        for (String let : array) {
            newArray.add(let);
            newArray.add(let);
        }
        for (String let : newArray) {
            System.out.printf("%s, ", let);
        }
    }
    public void taskNumberThree() {
        /*
        Задание 3
        Минимальное из N чисел(использовать LinkedList):
        1. Ввести с клавиатуры число N.
        2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
        3. Найти минимальное число среди элементов списка - метод getMinimum.
        */
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int []array = getIntegerList(n);
        System.out.println("Minimum: " + this.getMinimum(array));
    }
    public int[] getIntegerList(int n) {
        Scanner input = new Scanner(System.in);
        int []array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input.nextLine());
        }
        return array;
    }
    public int getMinimum(int [] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}