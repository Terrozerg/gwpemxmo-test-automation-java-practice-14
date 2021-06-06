package com.epam.test.automation.java.practice14.advanced.task11;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;

import java.util.*;
import java.util.stream.Collectors;

public class Task11 {
    private Task11(){}

    public static List<YearSchoolStat> getYearSchoolStats(List<Entrant> entrantList) {
        return entrantList.stream()
                .collect(Collectors.groupingBy(Entrant::getYearOfEntering,
                        Collectors.groupingBy(Entrant::getSchoolNumber)))
                .entrySet().stream()
                .map(item-> new YearSchoolStat(item.getKey(), item.getValue().size()))
                .sorted(Comparator.comparingInt(YearSchoolStat::getNumberOfSchools)
                        .thenComparingInt(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());
    }
}
