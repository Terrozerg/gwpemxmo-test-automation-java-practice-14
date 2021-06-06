package com.epam.test.automation.java.practice14.middle;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 {

    public static List<Integer> getSortedDifferenceBetweenSubsets(int number, List<Integer> integerList) {
        return Stream.concat(
                integerList.stream().filter(even -> even % 2 == 0),
                integerList.stream().skip(number))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(item -> item.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}