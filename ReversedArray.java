import java.util.Arrays;

public class ReversedArray {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(myReverse(numbers)));
    }


    public static int[] myReverse(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }




}

