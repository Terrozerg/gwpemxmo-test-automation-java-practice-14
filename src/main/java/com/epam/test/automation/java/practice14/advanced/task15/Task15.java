package com.epam.test.automation.java.practice14.advanced.task15;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Task15 {

    public static List<CountryStat> name(List<Good> goodList, List<StorePrice> storePriceList) {
        return goodList.stream()
                .collect(Collectors.groupingBy(Good::getCountryOfOrigin))
                .entrySet().stream()
                .map(goodsStore -> Collections.singletonMap(
                        goodsStore.getKey(),
                        goodsStore.getValue().stream()
                                .map(good -> storePriceList.stream()

                                        //get goods amount and store prices by this goods sku
                                        .collect(Collectors.groupingBy(StorePrice::getProductSKU))
                                        .entrySet().stream()
                                        .filter(storePrice -> storePrice.getKey() ==
                                                good.getProductSKU())
                                        .collect(Collectors.toMap(
                                                item -> item.getValue().size(),
                                                Map.Entry::getValue))
                                )

                                //sum all goods per country
                                .collect(Collectors.toMap(
                                        item -> item.keySet().stream().reduce(Integer::sum).orElse(0),
                                        item -> item.values().stream().flatMap(List::stream).collect(Collectors.toList())))
                        )
                )
                .map(item -> new CountryStat(item.keySet().iterator().next(),
                        item.values().iterator().next().keySet().iterator().next(),
                        item.values().iterator().next().
                                values().iterator().next().stream()
                                .map(StorePrice::getPrice)
                                .min(BigDecimal::compareTo)
                                .orElse(BigDecimal.ZERO))
                )
                .collect(Collectors.toList());
    }
}
