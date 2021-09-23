import java.util.Arrays;

public class first {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        myReverse(numbers, 8, 0);
    }

    public static int[] myReverse(int[] array, int count, int index) {
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                if ((array[i] +  array[index]) == count) {
                    System.out.println("1: " + array[i] + " 2: " + array[index] + " count = " + (array[i] + array[index]));
                    break;
                } else {
                    myReverse(array, count, index + 1);
                }
            }
        }

        return array;
    }
}


