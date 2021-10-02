package com.spart.sorterproject.testing.model;

import org.junit.jupiter.api.Test;
import com.sparta.sorterproject.model.BubbleSort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BubbleSortTesting {
    @Test
    public void bubbleSortOutputTestNormal(){
        BubbleSort bubbleSortTest = new BubbleSort();
        int [] testArrNormal = {10,40,900,4,30,90,100};
        String arrTestString = Arrays.toString(testArrNormal);
       assertTrue(bubbleSortTest.bubbleSort(testArrNormal).equals("[4, 10, 30, 40, 90, 100, 900]"));
    }
}
