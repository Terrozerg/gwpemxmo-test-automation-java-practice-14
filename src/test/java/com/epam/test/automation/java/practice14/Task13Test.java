package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;
import com.epam.test.automation.java.practice14.advanced.task13.Task13;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task13Test {

    @Test
    public void test(){
        List<Integer> yearsData = Arrays.asList(2001, 1999, 2000, 2002, 2003);
        List<Entrant> entrantsData = Arrays.asList(
                new Entrant(11, 2003, "Ivanov"),
                new Entrant(11, 2001, "Petrov"),
                new Entrant(11, 2001, "Pupkin"),
                new Entrant(10, 1999, "Zobkin"),
                new Entrant(10, 1999, "Zabkin"),
                new Entrant(10, 1999, "Ivanov"),
                new Entrant(10, 2000, "Petrov"),
                new Entrant(14, 2001, "Pupkin"),
                new Entrant(15, 2000, "Zobkin"),
                new Entrant(10, 2000, "Ivanov"),
                new Entrant(12, 2003, "Petrov"),
                new Entrant(11, 2003, "Pupkin"),
                new Entrant(10, 2003, "Zobkin")
        );
        List<YearSchoolStat> expected = Arrays.asList(
                new YearSchoolStat(2002, 0),
                new YearSchoolStat(1999, 1),
                new YearSchoolStat(2000, 2),
                new YearSchoolStat(2001, 2),
                new YearSchoolStat(2003, 3)
        );

        List<YearSchoolStat> result = Task13.getYearSchoolStatList(entrantsData, yearsData);

        Assert.assertEquals(result, expected);
    }
}
