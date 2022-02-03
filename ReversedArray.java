package hi;

import java.util.Random;

public class ReversedArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] someArray = new int[5];
        for (int i = 0; i < 5; i++) {
            someArray[i] = rand.nextInt(100);
        }
        for (int num : someArray){
            System.out.print(num + ", ");
        }
        int[] reversed = myReverse(someArray);
        System.out.println("");
        for (int num : reversed){
            System.out.print(num + ", ");
        }
    }
    public static int[] myReverse (int[] array){
        int size = array.length;
        int[] invertArray = new int[size];
        int temp = size;
        for (int i = 0; i < size; i++) {
            temp--;
            invertArray[i] = array[temp];
        }
        return invertArray;
    }
}
