package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    private Task5(){}

    public static List<String> getSortedAscOddValues(List<Integer> intList) {
        return intList.stream()
                .filter(item->item%2!=0)
                .map(Object::toString)
                .collect(Collectors.toList());
    }
}
