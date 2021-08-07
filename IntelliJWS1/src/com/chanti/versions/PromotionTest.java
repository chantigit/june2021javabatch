package com.chanti.versions;

import java.util.Arrays;
import java.util.List;

public class PromotionTest {
    public static void main(String[] args) {
        List<String> productsList = Arrays.asList(null);
        if(productsList.get(0).equals("p1"))
        {
            System.out.println("Your are eligible for aug15% promotions");
        }
    }
}
