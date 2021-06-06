package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task8 {
    private Task8(){}

    public static List<Integer> getSortedUnionTwoSubsetsIntegers(int d, int k, List<Integer> intList) {
        return intList.stream()
                .filter(item -> item > d &&
                        intList.subList(intList.indexOf(k), intList.size())
                        .contains(item))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
