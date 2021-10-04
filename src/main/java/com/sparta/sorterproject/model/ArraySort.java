package com.sparta.sorterproject.model;

import com.sparta.sorterproject.controller.DisplayManager;
import com.sparta.sorterproject.controller.SortManager;
import com.sparta.sorterproject.logging.LoggingManager;

import java.util.Arrays;

//using the java libary Arrays to sort an array
public class ArraySort implements SortManager {
    LoggingManager loggingData = new LoggingManager();
    DisplayManager displayData = new DisplayManager();

    public String arraysSort(int [] arr){
        Arrays.sort(arr);  // calling array sort from libary
        return Arrays.toString(arr);
    }
    //displays the sorted array and time
    @Override
    public void displaySortedArr() {
        //DISPLAY AND LOG THE SORTED ARRAY
        double startTime = System.nanoTime();
        System.out.println("The sorted array using Array sort: " + arraysSort(displayData.displayArray()));
        double elapsedTime = (System.nanoTime() - startTime)/1000000000;
        System.out.println("The time taken for Array sort: " + elapsedTime + " Seconds");
        loggingData.timeLog(elapsedTime);

    }
    //displays the sorted array and time for comparison
    @Override
    public void comparisonArr(int[] arr ) {
        System.out.println("The array being used again is:  " + Arrays.toString(arr));
        double newStartTime = System.nanoTime();
        System.out.println("The sorted array using Array sort comparison: " + arraysSort(arr));
        double newElapsedTime = (System.nanoTime() - newStartTime)/1000000000;
        System.out.println("The time taken for Array sort comparison: " + newElapsedTime + " Seconds");
        loggingData.timeLog(newElapsedTime);
    }
}
