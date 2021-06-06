package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task10;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task10Test {

    @Test
    public void testGetSortedLastLettersInUpperCase(){
        List<String> dataString = Arrays.asList("asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop");
        List<Character> expected = Arrays.asList('U', 'D', 'B', 'B', 'F', 'P', 'S', 'A');

        List<Character> result = Task10.getSortedLastLettersInUpperCase(dataString);

        Assert.assertEquals(result, expected);
    }
}
