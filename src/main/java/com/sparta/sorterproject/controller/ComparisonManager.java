package com.sparta.sorterproject.controller;

import com.sparta.sorterproject.logging.LoggingManager;
import com.sparta.sorterproject.view.DriverClass;

import java.util.Scanner;

import static java.lang.System.in;


public class ComparisonManager extends DriverClass {
    //class is used for the user to compare the sorts

    public void comparisonChoice(boolean newStatus, int[] copyArr){
        SortFactory sortFactory = new SortFactory();
        DisplayManager displayData = new DisplayManager();
        LoggingManager loggingData = new LoggingManager();
        ArrayGen arrayGen = new ArrayGen();

        while (newStatus) {
            System.out.println(displayData.getDisplayComparison()); //Displays the menu for the sorts
            try {
                Scanner scanner = new Scanner(in);  // take input
                int sortType = Integer.parseInt(scanner.next());
                switch (sortType) {
                    case 0:  // case for bubble sort
                        SortManager bubbleSortDisplay = sortFactory.getSort(0);
                        bubbleSortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;

                    case 1: // case for merge sort
                        SortManager mergeSortDisplay = sortFactory.getSort(1);
                        mergeSortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;

                    case 2: // case for quick sort
                        SortManager quickSortDisplay = sortFactory.getSort(2);
                        quickSortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;

                    case 3: // case for insertion sort
                        SortManager insertionSortDisplay = sortFactory.getSort(3);
                        insertionSortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;

                    case 4: // case for selection sort
                        SortManager selectionSortDisplay = sortFactory.getSort(4);
                        selectionSortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;

                    case 5: // case for tree sort
                        SortManager TreeSortDisplay = sortFactory.getSort(5);
                        TreeSortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;

                    case 6: // case for collection sort
                        SortManager CollectionSortDisplay = sortFactory.getSort(6);
                        CollectionSortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;

                    case 7: // case for array sort
                        SortManager ArraySortDisplay = sortFactory.getSort(7);
                        ArraySortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;

                    case 8: // case for parallel array sort
                        SortManager ParallelArraySortDisplay = sortFactory.getSort(8);
                        ParallelArraySortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;

                    case 9:   // exit the program
                        System.out.println("Thanks for using the program");
                        newStatus = false;
                        break;

                    default: // default for no cases used
                        System.err.println("Incorrect number in range please select a number between 0-9");
                }

            } catch (NumberFormatException n) {  // exception for anything other than an int
                System.err.println("Incorrect input " + n.getMessage());
                loggingData.exceptionLog(n.getMessage());

            }catch(NegativeArraySizeException v){ // exception for negative numbers
                System.err.println("Please input a positive int " + v.getMessage());
                loggingData.exceptionLog(v.getMessage());
            }

        }

    }
}
