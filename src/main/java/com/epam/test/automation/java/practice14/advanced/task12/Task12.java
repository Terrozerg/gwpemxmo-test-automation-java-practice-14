package com.epam.test.automation.java.practice14.advanced.task12;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task12 {
    private Task12(){}

    public static List<NumberPair> makeNumberPairsFromTwoList(List<Integer> integerList1, List<Integer> integerList2) {
        return integerList1.stream()
                .map(item -> new NumberPair(item,
                        integerList2.stream()
                                .filter(subItem -> Math.abs(item - subItem) % 10 == 0)
                                .findFirst()
                                .orElse(0)))
                .filter(item -> item.getValue2() != 0)
                .sorted(Comparator.comparingInt(NumberPair::getValue1)
                        .thenComparingInt(NumberPair::getValue2))
                .collect(Collectors.toList());
    }
}
