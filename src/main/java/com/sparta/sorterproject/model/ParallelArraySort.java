package com.sparta.sorterproject.model;

import com.sparta.sorterproject.controller.DisplayManager;
import com.sparta.sorterproject.controller.SortManager;
import com.sparta.sorterproject.logging.LoggingManager;

import java.util.Arrays;

//using the java libary Arrays to use parallel array sort

public class ParallelArraySort implements SortManager {
    LoggingManager loggingData = new LoggingManager();
    DisplayManager displayData = new DisplayManager();

    public String parallelArraysSort(int [] arr){
        Arrays.parallelSort(arr);
        return Arrays.toString(arr);
    }

    //displays the sorted array and time
    @Override
    public void displaySortedArr() {
        //DISPLAY AND LOG THE SORTED ARRAY
        double startTime = System.nanoTime();
        System.out.println("The sorted array using Parallel Array sort: " + parallelArraysSort(displayData.displayArray()));
        double elapsedTime = (System.nanoTime() - startTime)/1000000000;
        System.out.println("The time taken for Parallel Array sort: " + elapsedTime + " Seconds");
        loggingData.timeLog(elapsedTime);
    }
    //displays the sorted array and time for comparison
    @Override
    public void comparisonArr(int[] arr) {
        System.out.println("The array being used again is:  " + Arrays.toString(arr));
        double newStartTime = System.nanoTime();
        System.out.println("The sorted array using Parallel Array sort comparison: " + parallelArraysSort(arr));
        double newElapsedTime = (System.nanoTime() - newStartTime)/1000000000;
        System.out.println("The time taken for Parallel Array sort comparison: " + newElapsedTime + " Seconds");
        loggingData.timeLog(newElapsedTime);
    }
}
