import java.util.Arrays;

public class ReversedArray1 {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        subArray(numbers, 5, 3);
    }


    public static int [] subArray(int [] array, int index, int count) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }




}

