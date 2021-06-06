package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.task14.ShopWithMaxDiscountOwner;
import com.epam.test.automation.java.practice14.advanced.task14.Supplier;
import com.epam.test.automation.java.practice14.advanced.task14.SupplierDiscount;
import com.epam.test.automation.java.practice14.advanced.task14.Task14;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task14Test {

    @Test
    public void test() {
        List<Supplier> supplierData = Arrays.asList(
                new Supplier(1, 1993, "Sumskaya"),
                new Supplier(2, 1994, "Pushkinskaya"),
                new Supplier(3, 1995, "Beketova"),
                new Supplier(4, 1996, "Amosova"),
                new Supplier(5, 1996, "Amosova"));
        List<SupplierDiscount> supplierDiscountData = Arrays.asList(
                new SupplierDiscount(1, 9, "Posad"),
                new SupplierDiscount(2, 9, "Posad"),
                new SupplierDiscount(3, 10, "Colins"),
                new SupplierDiscount(4, 10, "Colins"),
                new SupplierDiscount(5, 10, "Denim"));
        List<ShopWithMaxDiscountOwner> expected = Arrays.asList(
                new ShopWithMaxDiscountOwner("Colins",
                        new Supplier(3, 1995, "Beketova")),
                new ShopWithMaxDiscountOwner("Denim",
                        new Supplier(5, 1996, "Amosova")),
                new ShopWithMaxDiscountOwner("Posad",
                        new Supplier(1, 1993, "Sumskaya")));

        List<ShopWithMaxDiscountOwner> result =
                Task14.getShopsWithMaxDiscountOwners(supplierData, supplierDiscountData);

        Assert.assertEquals(result, expected);
    }
}
