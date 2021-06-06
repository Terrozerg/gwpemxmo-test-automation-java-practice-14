package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task1;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task1Test {

    @Test
    public void testFilterByFirstAndLastCharacter(){
        List<String> data = Arrays.asList("abbba", "hhhaba", "babab", "aggtq", "ahaha");
        List<String> expected = Arrays.asList("abbba", "ahaha");

        List<String> result = Task1.filterByFirstAndLastCharacter('a', data);

        Assert.assertEquals(result, expected);
    }
}
