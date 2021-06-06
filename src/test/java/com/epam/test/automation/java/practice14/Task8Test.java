package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task8;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task8Test {

    @Test
    public void testGetSortedUnionTwoSubsetsIntegers(){
        int greaterThen = 3;
        int startWith = 4;
        List<Integer> dataIntArray = Arrays.asList(-10, 3, -3, 4, 55, 6);
        List<Integer> expected = Arrays.asList(55, 6, 4);

        List<Integer> result = Task8.getSortedUnionTwoSubsetsIntegers(greaterThen, startWith, dataIntArray);

        Assert.assertEquals(result, expected);
    }

}