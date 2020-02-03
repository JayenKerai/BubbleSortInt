package com.sparta.jk;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {1, 3, 4, 2, 6, 5, 2, 3, 10, 7, 9, 10, 9}; //array to be sorted
        BubbleSort bubbleSort = new BubbleSort();

        int[] sortedAsc = bubbleSort.sortDesc(intArray); //sort intArray ascending
        System.out.println(Arrays.toString(sortedAsc)); //prints ascending bubble-sorted intArray

        int[] sortedDesc = bubbleSort.sortAsc(intArray); //sort intArray descending
        System.out.println(Arrays.toString(sortedDesc)); //prints descending bubble-sorted intArray
    }
}
