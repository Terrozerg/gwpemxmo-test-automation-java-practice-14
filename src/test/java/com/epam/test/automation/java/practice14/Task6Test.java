package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task6;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task6Test {

    @Test
    public void testShouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber(){
        List<Integer> dataInt = Arrays.asList(1, 3, 4);
        List<String> dataString = Arrays.asList("1aa", "aaa", "1", "a");
        List<String> expected = Arrays.asList("1", "1aa", "Not Found");

        List<String> result = Task6.shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber(dataInt, dataString);

        Assert.assertEquals(result, expected);
    }
}
