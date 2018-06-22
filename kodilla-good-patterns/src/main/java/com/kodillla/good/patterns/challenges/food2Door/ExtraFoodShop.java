package com.kodillla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Shop {

    private final String shopName = "ExtraFoodShop";

    Map<String, Double> productsMap = new HashMap<>();


    public ExtraFoodShop() {
        productsMap.put("Potatoes", 3.49);
        productsMap.put("Tomatoes", 5.49);
        productsMap.put("Carrots", 4.90);

    }

    public boolean process(OrderRequest orderRequest){
        System.out.println("Welcome to " + shopName);
        System.out.println("Only today 10% discount on all productsMap");
        return true;
    }
}
