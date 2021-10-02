package com.sparta.sorterproject.model;

import com.sparta.sorterproject.controller.DisplayManager;
import com.sparta.sorterproject.controller.SortManager;
import com.sparta.sorterproject.logging.LoggingManager;

import java.util.Arrays;

public class QuickSort implements SortManager {
    LoggingManager loggingData = new LoggingManager();
    DisplayManager displayData = new DisplayManager();

    private int[] numbers;
    private int number;

    public String quickSort(int[] arr) {
        // check for empty or null array
        if (arr ==null || arr.length==0){
            return null;
        }
        this.numbers = arr;
        number = arr.length;
        quickSortNext(0, number - 1);
        return Arrays.toString(arr);
    }

    private void quickSortNext(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quickSortNext(low, j);
        if (i < high)
            quickSortNext(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }


    public void displaySortedArr() {
        double startTime = System.nanoTime();
        System.out.println("The sorted array using Quick sort: " + quickSort(DisplayManager.displayArray()));
        double elapsedTime = System.nanoTime() - startTime;
        System.out.println("The time taken for Quick sort: " + (elapsedTime/1000000000) + " Seconds");
    }
}