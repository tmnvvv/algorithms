package hi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.print("Введите число, которое хотите представить: ");
        int value = scan.nextInt();
        String result = task(array, value, 0, 1);
        System.out.println(result);

    }

    public static String task(int[] array, int value, int idx1, int idx2) {
        if (array.length == 0) {
            return "Ошибка.";
        }
        String str = "Нет результата.";
        if (array[idx1] + array[idx2] == value) {
            int num1 = array[idx1];
            int num2 = array[idx2];
            System.out.println("" + num1 + " + " + num2 + " = " + value);
        }

        if (idx1 + 1 == array.length) {
            return str;
        } else {
            if (idx2 + 1 < array.length && array[idx2 + 1] != array[idx2] ) {
                str = task(array, value, idx1, idx2 + 1);
            } else {
                str = task(array, value, idx1 + 1, 0);
            }
        }

        return str;
    }
}
