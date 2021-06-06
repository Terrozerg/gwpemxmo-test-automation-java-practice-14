package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task5;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task5Test {

    @Test
    public void testGetSortedAscOddValues(){
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> expected = Arrays.asList("1", "3", "5");

        List<String> result = Task5.getSortedAscOddValues(data);

        Assert.assertEquals(result, expected);
    }

}