package com.sparta.sorterproject.controller;

import com.sparta.sorterproject.model.*;

//sort factory method implementation

public class SortFactory {
    DisplayManager displayData = new DisplayManager();

    public SortManager getSort(int typeSort) {
        if (typeSort == 0) {
            return new BubbleSort();
        }
        else if(typeSort == 1) {
            return new MergeSort();
        }
        else if(typeSort == 2){
            return new QuickSort();
        }
        else if(typeSort == 3){
            return new InsertionSort();
        }
        else if(typeSort == 4){
            return new SelectionSort();
        }
        else if(typeSort == 5){
            return new TreeSort();
        }
        else if(typeSort == 6){
            return new CollectionSort();
        }
        else if(typeSort == 7){
            return new ArraySort();
        }
        else if(typeSort == 8){
            return new ParallelArraySort();
        }
        return null;
    }
}