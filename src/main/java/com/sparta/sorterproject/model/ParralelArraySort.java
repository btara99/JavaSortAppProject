package com.sparta.sorterproject.model;

import com.sparta.sorterproject.controller.DisplayManager;
import com.sparta.sorterproject.controller.SortManager;
import com.sparta.sorterproject.logging.LoggingManager;

import java.util.Arrays;

public class ParralelArraySort implements SortManager {
    LoggingManager loggingData = new LoggingManager();
    DisplayManager displayData = new DisplayManager();

    public String parralelArraysSort(int [] arr){
        Arrays.parallelSort(arr);
        return Arrays.toString(arr);
    }


    @Override
    public void displaySortedArr() {
        //DISPLAY AND LOG THE SORTED ARRAY
        double startTime = System.nanoTime();
        System.out.println("The sorted array using Parrallel Array sort: " + parralelArraysSort(displayData.displayArray()));
        double elapsedTime = (System.nanoTime() - startTime)/1000000000;
        System.out.println("The time taken for Parrallel Array sort: " + elapsedTime + " Seconds");
        loggingData.timeLog(elapsedTime);
    }
}
