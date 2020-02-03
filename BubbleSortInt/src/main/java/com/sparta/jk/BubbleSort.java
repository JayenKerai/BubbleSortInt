package com.sparta.jk;

/*
- performs bubble sort on input array of ints (intArray)
- Use sortAsc() for ascending order, and sortDesc() for descending order
 */

public class BubbleSort {

    public int[] sortAsc(int[] intArray) {
        int pointer = 0; //points to current location in array
        while (pointer < intArray.length - 1) { //loop until the array is sorted (end of array reached)
            if (isBiggerThanNext(pointer, intArray)) { //checks if current pointer location is bigger than next location
                swap(pointer, intArray); //swaps if value at pointer+1 is smaller than at pointer
                pointer = 0; //reset pointer when swap occurs
            } else {
                pointer++; //increment pointer when the order is correct at pointer and pointer+1
            }
        }
        return intArray;
    }

    public int[] sortDesc(int[] intArray) {
        int pointer = 0; //points to current location in array
        while (pointer < intArray.length - 1) { //loop until the array is sorted (end of array reached)
            if (isSmallerThanNext(pointer, intArray)) { //checks if current pointer location is smaller than next location
                swap(pointer, intArray); //swaps if value at pointer+1 is bigger than at pointer
                pointer = 0; //reset pointer when swap occurs
            } else {
                pointer++; //increment pointer when the order is correct at pointer and pointer+1
            }
        }
        return intArray;
    }

    private void swap(int i, int[] intArray) { //swaps ints at i and i+1
        int temp = intArray[i]; //stores int at i in temp
        intArray[i] = intArray[i + 1]; //puts i+1 where i is
        intArray[i + 1] = temp; // puts stored int at i+1
    }

    private boolean isBiggerThanNext(int i, int[] intArray) { //if i is greater than i+1, return true, else return false
        return (intArray[i] > intArray[i + 1]);
    }

    private boolean isSmallerThanNext(int i, int[] intArray) { //if i is smaller than i+1, return true, else return false
        return (intArray[i] < intArray[i + 1]);
    }

}
