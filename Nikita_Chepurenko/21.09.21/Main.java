package com.company;

import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("TASK NUMBER ONE: ");
        System.out.println("#####################################");
        System.out.println("Кол-во эелементов в массиве?:");
        System.out.print("> ");
        int countElementsInMassive = input.nextInt();
        CustomerArray cusArr = new CustomerArray(countElementsInMassive);
        System.out.print("Начальный массив: ");
        int []array = cusArr.generateArray();
        cusArr.getArray(array);
        System.out.println("\nmin: " + cusArr.getMin());
        System.out.println("max: " + cusArr.getMax());
        System.out.println("sum: " + cusArr.getSum());
        System.out.println("mean: " + cusArr.getMean());
        int[] notEvenArray = cusArr.getNotEvenArray();
        System.out.print("Нечетные значения: ");
        cusArr.getArray(notEvenArray);

        System.out.println("\n#####################################");


        System.out.println("TASK NUMBER TWO: ");
        System.out.println("#####################################");
        ReversedArray reversedArray = new ReversedArray();
        int []reversedArr = reversedArray.myReverse(array);
        System.out.println("Начальный Array: ");
        cusArr.getArray(array);
        System.out.println("\nРеверснутый Array: ");
        cusArr.getArray(reversedArr);
        System.out.println("\nИндекс массива с котого мы начинаем: ");
        System.out.print("> ");
        int indexOfArray = input.nextInt();
        System.out.println("кол-во эллементов массива: ");
        System.out.print("> ");
        int countOfArray = input.nextInt();
        System.out.println("sub array: ");
        int []subArr = reversedArray.subArray(array, indexOfArray, countOfArray);
        cusArr.getArray(subArr);
        System.out.println("\n#####################################");

        System.out.println("TASK NUMBER THREE: ");
        System.out.println("#####################################");
        UserArray uArr = new UserArray();
        System.out.println("Введите число которое хотите добавить: ");
        System.out.print("> ");
        int number = input.nextInt();
        int []addNumberArray = uArr.addNumber(array, number);
        System.out.println("\nНачальный array: ");
        cusArr.getArray(array);
        System.out.println("\nArray с добавленным значением: ");
        cusArr.getArray(addNumberArray);
        System.out.println("\n#####################################");

    }
}