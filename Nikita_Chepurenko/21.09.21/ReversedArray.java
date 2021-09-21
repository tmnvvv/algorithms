package com.company;

public class ReversedArray {
    public int[] myReverse(int []array) {
        int []reversedArrayList = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            reversedArrayList[index] = array[array.length-((index == 0) ? 1 : index+1)];
        }
        return  reversedArrayList;
    }

    public int[] subArray(int [] array, int index, int count) {
        int []subArr = new int[count];
        for (int idx = 0; idx < subArr.length; idx++) {
            if (index-1 < array.length) {
                subArr[idx] = array[index-1];
                index++;
            } else {
                subArr[idx] = 1;
            }
        }
        return subArr;
    }
}
