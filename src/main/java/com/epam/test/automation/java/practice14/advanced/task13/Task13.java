package com.epam.test.automation.java.practice14.advanced.task13;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task13 {
    private Task13(){}

    public static List<YearSchoolStat> getYearSchoolStatList(List<Entrant> nameList, List<Integer> yearList) {
        return yearList.stream()
                .map(item -> new YearSchoolStat(item,
                        nameList.stream()
                                .collect(Collectors.groupingBy(Entrant::getYearOfEntering,
                                        Collectors.groupingBy(Entrant::getSchoolNumber)))
                                .entrySet().stream()
                                .filter(subItem -> item.equals(subItem.getKey()))
                                .findFirst()
                                .map(subItem -> subItem.getValue().size())
                                .orElse(0)))
                .sorted(Comparator.comparingInt(YearSchoolStat::getNumberOfSchools)
                        .thenComparingInt(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());
    }
}