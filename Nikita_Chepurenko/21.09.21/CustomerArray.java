package com.company;

public class CustomerArray {
    public int nElementsInMassive;
    public int []array;

    public CustomerArray (int nItems) {
        this.nElementsInMassive = nItems;
        this.array = new int[nItems];
    }

    public int[] generateArray() {
        for (int index = 0; index < this.array.length; index++) {
            this.array[index] = (int) (Math.random() * 100);
        }
        return this.array;
    }

    public void getArray(int []array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + ", ");
        }
    }

    public int getMin() {
        int min = this.array[0];
        for (int index = 0; index < this.array.length; index++) {
            if (this.array[index] < min) {
                min = this.array[index];
            }
        }
        return min;
    }

    public int getMax() {
        int max = this.array[0];
        for (int index = 0; index < this.array.length; index++) {
            if (this.array[index] > max) {
                max = this.array[index];
            }
        }
        return max;
    }

    public int getSum() {
        int sum = 0;
        for (int index = 0; index < this.array.length; index++) {
            sum += this.array[index];
        }
        return sum;
    }

    public int getMean() {
        return getSum() / this.nElementsInMassive;
    }

    private int getCountNotEvenElementsInArray() {
        int count = 0;
        for (int index = 0; index < this.array.length; index++) {
            if (this.array[index] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int[] getNotEvenArray() {
        int []notEvenArrayList = new int[getCountNotEvenElementsInArray()];
        int indexForNotEven = 0;
        for (int index = 0; index < this.array.length; index++) {
            if (this.array[index] % 2 != 0) {
                notEvenArrayList[indexForNotEven] = this.array[index];
                indexForNotEven++;
            }
        }
        return notEvenArrayList;
    }
}
