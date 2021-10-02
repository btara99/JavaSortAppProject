package com.sparta.sorterproject.model;

import com.sparta.sorterproject.controller.DisplayManager;
import com.sparta.sorterproject.controller.SortManager;
import com.sparta.sorterproject.logging.LoggingManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort implements SortManager {
    LoggingManager loggingData = new LoggingManager();
    DisplayManager displayData = new DisplayManager();

    public String collectionSort(int [] arr){
        List<Integer> arrlist = Arrays.stream(arr).boxed().toList();
        Collections.sort(arrlist);
        return arrlist.toString();
    }

    @Override
    public void displaySortedArr() {
        //DISPLAY AND LOG THE SORTED ARRAY
        double startTime = System.nanoTime();
        System.out.println("The sorted array using Collections sort: " + collectionSort(displayData.displayArray()));
        double elapsedTime = (System.nanoTime() - startTime)/1000000000;
        System.out.println("The time taken for Collections sort: " + elapsedTime + " Seconds");
        loggingData.timeLog(elapsedTime);

    }
}
