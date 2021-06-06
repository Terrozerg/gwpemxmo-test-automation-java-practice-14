package com.epam.test.automation.java.practice14.advanced.task14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task14 {
    public static List<ShopWithMaxDiscountOwner> getShopsWithMaxDiscountOwners(
            List<Supplier> supplierList,
            List<SupplierDiscount> supplierDiscountList) {

        return supplierDiscountList.stream()
                .collect(Collectors.groupingBy(SupplierDiscount::getStoreName))
                .entrySet().stream()
                .map(item -> new ShopWithMaxDiscountOwner(item.getKey(),
                        Objects.requireNonNull(supplierList.stream()
                                .filter(supplier -> supplier.getCustomerId() ==
                                        Objects.requireNonNull(item.getValue().stream()
                                                .max(Comparator.comparingInt(SupplierDiscount::getDiscountPercentage)
                                                        .thenComparing(Comparator.comparingInt(SupplierDiscount::getCustomerId)
                                                                .reversed()))
                                                .orElse(null))
                                                .getCustomerId())
                                .findFirst()
                                .orElse(null))))
                .sorted(Comparator.comparing(ShopWithMaxDiscountOwner::getStoreName))
                .collect(Collectors.toList());
    }
}
