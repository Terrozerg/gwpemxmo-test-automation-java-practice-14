package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task2;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task2Test {

    @Test
    public void testSortAscLengthsOfStrings() {
        List<String> data = Arrays.asList("Hello", "world", "!", "Good", "morning", "!");
        List<Integer> expected = Arrays.asList(1, 1, 4, 5, 5, 7);

        List<Integer> result = Task2.sortAscLengthsOfStrings(data);

        Assert.assertEquals(result, expected);
    }
}