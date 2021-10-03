package com.sparta.sorterproject.controller;

import com.sparta.sorterproject.logging.LoggingManager;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class DisplayManager{

    //Class to display what will be shown on screen for the user mainly for UI

    private static final String sizeTitle = // displays the int text for user
            "\nSORTING PROJECT \n"+
                    "\t************************************************\n" +
                    "\t| Please pick an int number for the array size |\n" +
                    "\t************************************************\n" ;

    private static final String displaySorts = // display the sorts for user
            "\nSORTING PROJECT \n"+
                    "\t**********************************************\n" +
                    "\t|  Pick a number between 0-5 for the sort    |\n" +
                    "\t|                                            |\n" +
                    "\t| Type: 0 for Bubble sort                    |\n" +
                    "\t| Type: 1 for Merge sort                     |\n" +
                    "\t| Type: 2 for Quick sort                     |\n" +
                    "\t| Type: 3 for Insertion sort                 |\n" +
                    "\t| Type: 4 for Selection sort                 |\n" +
                    "\t| Type: 5 for Binary Tree based sort         |\n" +
                    "\t| Type: 6 for Collection sort                |\n" +
                    "\t| Type: 7 for Array sort                     |\n" +
                    "\t| Type: 8 for Parallel array sort            |\n" +
                    "\t**********************************************\n" ;


    public static String displayTitle(){ //getter for the size title
        return sizeTitle;
    }

    public String displaySorts(){  //getter for displaying the sorts
        return displaySorts;
    }


    public static int[] displayArray(){  // displays the array by calling the array gen method
        ArrayGen arrayGen = new ArrayGen();
        LoggingManager loggingData = new LoggingManager();
        Scanner scanner = new Scanner(in);
        System.out.println(displayTitle());
        int arrayLength = Integer.parseInt(scanner.next());
        int[] arrayBefore = arrayGen.arrayGen(arrayLength);
        System.out.println("The array before sorting: " + Arrays.toString(arrayBefore));
        loggingData.arrayLog(Arrays.toString(arrayBefore));

        return arrayBefore;
    }
    

}