package com.sparta.sorterproject.model;

import com.sparta.sorterproject.controller.DisplayManager;
import com.sparta.sorterproject.controller.SortManager;
import com.sparta.sorterproject.logging.LoggingManager;

import java.util.Arrays;

//implementation of Insertion sort

public class InsertionSort implements SortManager {
    LoggingManager loggingData = new LoggingManager();
    DisplayManager displayData = new DisplayManager();

    public static String insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            arr[j+1] = current;
        }
        return Arrays.toString(arr);
    }
    //displays the sorted array and time
    public void displaySortedArr() {
        //DISPLAY SORTED ARRAY
        double startTime = System.nanoTime();
        System.out.println("The sorted array using Insertion sort: " + insertionSort(displayData.displayArray()));
        double elapsedTime = (System.nanoTime() - startTime)/1000000000;
        System.out.println("The time taken for Insertion sort: " + elapsedTime + " Seconds");
        loggingData.timeLog(elapsedTime);

    }
    //displays the sorted array and time for comparison
    @Override
    public void comparisonArr(int[] arr) {
        System.out.println("The array being used again is:  " + Arrays.toString(arr));
        double newStartTime = System.nanoTime();
        System.out.println("The sorted array using Insertion sort for comparison: " + insertionSort(arr));
        double newElapsedTime = (System.nanoTime() - newStartTime)/1000000000;
        System.out.println("The time taken for Insertion sort comparison: " + newElapsedTime + " Seconds");
        loggingData.timeLog(newElapsedTime);
    }

}
