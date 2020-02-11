package com.gorajski.spring.basics.springinsteps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired  // Read as: "SortAlgorithm is a dependency of BinarySearchImpl"
    private SortAlgorithm quickSortAlgorithm;  //@Primary has higher priority over local variable name

    public BinarySearchImpl(SortAlgorithm quickSortAlgorithm) {
        this.quickSortAlgorithm = quickSortAlgorithm;
    }


    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = quickSortAlgorithm.sort(numbers);
        System.out.println(quickSortAlgorithm.getClass());

        return 3;
    }
}
