package com.sparta.sorterproject.model;

import com.sparta.sorterproject.controller.DisplayManager;
import com.sparta.sorterproject.controller.SortManager;
import com.sparta.sorterproject.logging.LoggingManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


//using the java libary Collections to sort an array

public class CollectionSort implements SortManager {
    LoggingManager loggingData = new LoggingManager();
    DisplayManager displayData = new DisplayManager();

    public String collectionSort(int [] arr){
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int i:arr){
            arrlist.add(i);
        }
        Collections.sort(arrlist);
        return String.valueOf(arrlist);
    }

    //displays the sorted array and time
    @Override
    public void displaySortedArr() {
        //DISPLAY AND LOG THE SORTED ARRAY
        double startTime = System.nanoTime();
        System.out.println("The sorted array using Collections sort: " + collectionSort(displayData.displayArray()));
        double elapsedTime = (System.nanoTime() - startTime)/1000000000;
        System.out.println("The time taken for Collections sort: " + elapsedTime + " Seconds");
        loggingData.timeLog(elapsedTime);

    }
    //displays the sorted array and time for comparison
    @Override
    public void comparisonArr(int[] arr) {
        System.out.println("The array being used again is:  " + Arrays.toString(arr));
        double newStartTime = System.nanoTime();
        System.out.println("The sorted array using collection sort comparison: " + collectionSort(arr));
        double newElapsedTime = (System.nanoTime() - newStartTime)/1000000000;
        System.out.println("The time taken for collection sort comparison: " + newElapsedTime + " Seconds");
        loggingData.timeLog(newElapsedTime);
    }
}
