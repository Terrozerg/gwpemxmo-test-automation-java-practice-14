package com.epam.test.automation.java.practice14.middle;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    private Task6(){}

    public static List<String> shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber
            (List<Integer> numbers, List<String> stringList) {

        return numbers.stream()
                .map(number->
                        stringList.stream()
                                .filter(item-> item.matches("^\\d.{"+(number-1)+"}"))
                                .findFirst()
                                .orElse("Not Found"))
                .collect(Collectors.toList());
    }
}
