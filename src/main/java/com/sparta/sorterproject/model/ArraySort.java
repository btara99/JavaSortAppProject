package com.sparta.sorterproject.model;

import com.sparta.sorterproject.controller.SortManager;

import java.util.Arrays;

public class ArraySort implements SortManager {

    public String arraysSort(int [] arr){
        Arrays.sort(arr);
        return arr.toString();
    }

    @Override
    public void displaySortedArr() {

    }
}
