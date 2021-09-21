package hi;

import java.util.Arrays;

public class UserArray {
    public static void main(String[] args) {
        int[] someArray = new int[5];
        System.out.println(someArray.length);
        expand(someArray);
        System.out.println(someArray.length);
    }
    public static void expand(int[] array){
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
