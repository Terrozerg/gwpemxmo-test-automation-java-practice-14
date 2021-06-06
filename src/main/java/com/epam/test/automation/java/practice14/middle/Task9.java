package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task9 {

    public static List<String> shouldReturnStringListWithLengthAndFirstLetter(List<String> stringList) {
        return stringList.stream()
                .collect(Collectors.groupingBy(item -> item.charAt(0), Collectors.summingInt(String::length)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .map(item -> item.getValue() + "-" + item.getKey())
                .collect(Collectors.toList());
    }
}
