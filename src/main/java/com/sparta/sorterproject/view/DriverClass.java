package com.sparta.sorterproject.view;

import com.sparta.sorterproject.controller.*;
import com.sparta.sorterproject.logging.LoggingManager;

import java.util.Scanner;
import static java.lang.System.*;

public class DriverClass {
    private static int[] copyArr; // creates a variable to store the copy of the array

    public static void main(String[] args) {
        SortFactory sortFactory = new SortFactory();
        DisplayManager displayData = new DisplayManager();
        LoggingManager loggingData = new LoggingManager();
        ComparisonManager comparisonManager = new ComparisonManager();
        ArrayGen arrayGen = new ArrayGen();
        boolean status = true;
        boolean newStatus = true;

        while (status) {
            System.out.println(displayData.displaySorts()); //Displays the menu for the sorts
            try {
                Scanner scanner = new Scanner(in);
                int sortType = Integer.parseInt(scanner.next());
                switch (sortType) {
                    case 0:
                        SortManager bubbleSortDisplay = sortFactory.getSort(0);
                        bubbleSortDisplay.displaySortedArr();
                        status = false;
                        break;

                    case 1:
                        SortManager mergeSortDisplay = sortFactory.getSort(1);
                        mergeSortDisplay.displaySortedArr();
                        status = false;
                        break;

                    case 2:
                        SortManager quickSortDisplay = sortFactory.getSort(2);
                        quickSortDisplay.displaySortedArr();
                        status = false;
                        break;

                    case 3:
                        SortManager insertionSortDisplay = sortFactory.getSort(3);
                        insertionSortDisplay.displaySortedArr();
                        status = false;
                        break;

                    case 4:
                        SortManager selectionSortDisplay = sortFactory.getSort(4);
                        selectionSortDisplay.displaySortedArr();
                        status = false;
                        break;
                    case 5:
                        SortManager TreeSortDisplay = sortFactory.getSort(5);
                        TreeSortDisplay.displaySortedArr();
                        status = false;
                        break;
                    case 6:
                        SortManager CollectionSortDisplay = sortFactory.getSort(6);
                        CollectionSortDisplay.displaySortedArr();
                        status = false;
                        break;
                    case 7:
                        SortManager ArraySortDisplay = sortFactory.getSort(7);
                        ArraySortDisplay.displaySortedArr();
                        status = false;
                        break;
                    case 8:
                        SortManager ParallelArraySortDisplay = sortFactory.getSort(8);
                        ParallelArraySortDisplay.displaySortedArr();
                        status = false;
                        break;


                    default:
                        System.err.println("Incorrect number in range please select a number between 0-8");
                }

            } catch (NumberFormatException n) {
                System.err.println("Incorrect input " + n.getMessage());
                loggingData.exceptionLog(n.getMessage());

            }catch(NegativeArraySizeException v){
                System.err.println("Please input a positive int " + v.getMessage());
                loggingData.exceptionLog(v.getMessage());
            }

        }
        //displays the comparison menu
        comparisonManager.comparisonChoice(newStatus,copyArr);

    }
    //clones the array for comparison
    public int[] cloneArr(int[] arr){
        this.copyArr = arr.clone();
        return copyArr;
    }


}



