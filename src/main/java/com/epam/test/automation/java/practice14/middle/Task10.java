package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {
    public static List<Character> getSortedLastLettersInUpperCase(List<String> stringList) {
        return stringList.stream()
                .sorted(Comparator.comparingInt(String::length)
                        .reversed())
                .map(item->Character.toUpperCase(
                        item.charAt(item.length()-1)))
                .collect(Collectors.toList());
    }
}