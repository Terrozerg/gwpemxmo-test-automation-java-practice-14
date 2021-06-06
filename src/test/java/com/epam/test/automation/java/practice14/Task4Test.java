package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task4;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task4Test {

    @Test
    public void testFilterAndSortByLastDigit(){
        List<String> data = Arrays.asList("8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B");
        List<String> expected = Arrays.asList("A1", "S3");

        List<String> result = Task4.filterAndSortByLastDigit(2, data);

        Assert.assertEquals(result, expected);
    }
}
