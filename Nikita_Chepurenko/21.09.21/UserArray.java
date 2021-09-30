package com.company;

public class UserArray {
    public int[] addNumber(int[] array, int number) {
        int []newArray = new int[array.length+1];
        for (int index = 0; index < newArray.length; index++) {
            System.out.println("here");
            if (index == 0) {
                newArray[index] = number;
            } else {
                newArray[index] = array[index-1];
            }
        }
        return newArray;
    }
}
