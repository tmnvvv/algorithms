package hi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int[] myArray;
        ArrayList<Integer> odds = new ArrayList<Integer>();
        System.out.print("Введите размер массива: ");
        int size = scan.nextInt();
        myArray = new int[size];
        for (int i = 0; i < size; i++) {
            int value = random.nextInt(100);
            myArray[i] = value;
        }
        System.out.print("Значения: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        System.out.println("");
        Arrays.sort(myArray);
        int min = myArray[0];
        int max = myArray[size-1];
        int sum = 0;
        for (int num : myArray){
            sum += num;
            if (num%2 == 1){
                odds.add(num);
            }
        }
        System.out.print("Нечетные: ");
        for (int num : odds){
            System.out.print(num + " ");
        }
        int avg = sum/size;
        System.out.printf("\nМин: %d, Макс: %d, Сумма: %d, Среднее: %d\n", min, max, sum, avg);
    }
}
