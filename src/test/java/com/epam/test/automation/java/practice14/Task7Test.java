package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task7;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task7Test {

    @Test
    public void testGetSortedDifferenceBetweenSubsets(){
        int dataNumber = 5;
        List<Integer> dataIntArray = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> expected = Arrays.asList(9, 7, 4, 2);

        List<Integer> result = Task7.getSortedDifferenceBetweenSubsets(dataNumber, dataIntArray);
        result.forEach(System.out::println);

        Assert.assertEquals(result, expected);
    }
}
