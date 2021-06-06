package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.task12.NumberPair;
import com.epam.test.automation.java.practice14.advanced.task12.Task12;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task12Test {

    @Test
    public void test(){
        List<Integer> dataIntFirst = Arrays.asList(1,2,33,44);
        List<Integer> dataIntSecond = Arrays.asList(11,22,13);
        List<NumberPair> expected = Arrays.asList(
                new NumberPair(1,11),
                new NumberPair(2,22),
                new NumberPair(33,13));

        List<NumberPair> result = Task12.makeNumberPairsFromTwoList(dataIntFirst, dataIntSecond);

        Assert.assertEquals(result, expected);
    }
}