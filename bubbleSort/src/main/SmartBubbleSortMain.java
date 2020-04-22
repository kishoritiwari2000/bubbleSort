package main;

import smartbubble.SmartBubbleSort;

public class SmartBubbleSortMain {
    public static void main(String[] args) {
        SmartBubbleSort smartBubSort = new SmartBubbleSort();
        int[] array = {20, 63, 51, 29, 31, 46};
        System.out.println("UNSORTED ARRAY");
        smartBubSort.printArray(array);
        System.out.println("ARRAY SORTED BY BUBBLE SORT");
        smartBubSort.smartBubbleSort(array);
        smartBubSort.printArray(array);
    }
}
