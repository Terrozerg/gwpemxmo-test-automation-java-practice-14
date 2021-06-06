package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task9;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task9Test {

    @Test
    public void testShouldReturnStringListWithLengthAndFirstLetter(){
        List<String> dataString = Arrays.asList("ABC", "A", "BCD", "D");
        List<String> expected = Arrays.asList("4-A", "3-B", "1-D");

        List<String> result = Task9.shouldReturnStringListWithLengthAndFirstLetter(dataString);

        System.out.println(result);
        Assert.assertEquals(result, expected);
    }
}
