package com.sparta.sorterproject.model;

import com.sparta.sorterproject.controller.SortManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort implements SortManager {
    public String collectionSort(int [] arr){
        List<Integer> arrlist = Arrays.stream(arr).boxed().toList();
        Collections.sort(arrlist);
        return arrlist.toString();
    }

    @Override
    public void displaySortedArr() {

    }
}
