package com.sparta.sorterproject.model;

import com.sparta.sorterproject.controller.SortManager;

import java.util.Arrays;

public class ParrallelArraySort implements SortManager {

    public String parrallelArraysSort(int [] arr){
        Arrays.parallelSort(arr);
        return arr.toString();
    }


    @Override
    public void displaySortedArr() {

    }
}
