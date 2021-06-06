package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task3;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task3Test {

    @Test
    public void testGetListExtremeLetters(){
        List<String> data = Arrays.asList("asd", "a", "basdw");
        List<String> expected = Arrays.asList("ad", "aa", "bw");

        List<String> result = Task3.getListExtremeLetters(data);

        Assert.assertEquals(result, expected);
    }
}
