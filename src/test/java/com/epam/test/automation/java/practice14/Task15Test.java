package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.task15.CountryStat;
import com.epam.test.automation.java.practice14.advanced.task15.Good;
import com.epam.test.automation.java.practice14.advanced.task15.StorePrice;
import com.epam.test.automation.java.practice14.advanced.task15.Task15;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Task15Test {

    @Test
    public void testName(){
        List<Good> goodsData = Arrays.asList(
                new Good(1, "milk", "Poland"),
                new Good(2, "milk", "Russia"));
        List<StorePrice> storePriceData = Arrays.asList(
                new StorePrice(1, "BigShop", new BigDecimal("12.50")),
                new StorePrice(1, "SushiBar", new BigDecimal("10.50")),
                new StorePrice(2, "BigShop", new BigDecimal("12.50")));
        List<CountryStat> expected = Arrays.asList(
                new CountryStat("Poland", 2, new BigDecimal("10.50")),
                new CountryStat("Russia", 1, new BigDecimal("12.50")));

        List<CountryStat> result = Task15.name(goodsData, storePriceData);

        result.forEach(
                item-> System.out.println(item.getCountryOfOrigin()+
                        "\t"+item.getNumberOfStores()+
                        "\t"+item.getMinimumPrice())
        );

        Assert.assertEquals(result, expected);
    }
}