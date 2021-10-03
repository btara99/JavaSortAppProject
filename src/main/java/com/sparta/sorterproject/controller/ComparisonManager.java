package com.sparta.sorterproject.controller;

import com.sparta.sorterproject.logging.LoggingManager;
import com.sparta.sorterproject.view.DriverClass;

import java.util.Scanner;

import static java.lang.System.in;


public class ComparisonManager extends DriverClass {

    public void comparisonChoice(boolean newStatus, int[] copyArr){
        SortFactory sortFactory = new SortFactory();
        DisplayManager displayData = new DisplayManager();
        LoggingManager loggingData = new LoggingManager();
        ArrayGen arrayGen = new ArrayGen();

        while (newStatus) {
            System.out.println(displayData.getDisplayComparison()); //Displays the menu for the sorts
            try {
                Scanner scanner = new Scanner(in);
                int sortType = Integer.parseInt(scanner.next());
                switch (sortType) {
                    case 0:
                        SortManager bubbleSortDisplay = sortFactory.getSort(0);
                        bubbleSortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;

                    case 1:
                        SortManager mergeSortDisplay = sortFactory.getSort(1);
                        mergeSortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;

                    case 2:
                        SortManager quickSortDisplay = sortFactory.getSort(2);
                        quickSortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;

                    case 3:
                        SortManager insertionSortDisplay = sortFactory.getSort(3);
                        insertionSortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;

                    case 4:
                        SortManager selectionSortDisplay = sortFactory.getSort(4);
                        selectionSortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;
                    case 5:
                        SortManager TreeSortDisplay = sortFactory.getSort(5);
                        TreeSortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;
                    case 6:
                        SortManager CollectionSortDisplay = sortFactory.getSort(6);
                        CollectionSortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;
                    case 7:
                        SortManager ArraySortDisplay = sortFactory.getSort(7);
                        ArraySortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;
                    case 8:
                        SortManager ParallelArraySortDisplay = sortFactory.getSort(8);
                        ParallelArraySortDisplay.comparisonArr(copyArr);
                        newStatus = false;
                        break;

                    case 9:
                        System.out.println("Thanks for using the program");
                        newStatus = false;
                        break;

                    default:
                        System.err.println("Incorrect number in range please select a number between 0-5");
                }

            } catch (NumberFormatException n) {
                System.err.println("Incorrect input " + n.getMessage());
                loggingData.exceptionLog(n.getMessage());

            }

        }

    }
}
