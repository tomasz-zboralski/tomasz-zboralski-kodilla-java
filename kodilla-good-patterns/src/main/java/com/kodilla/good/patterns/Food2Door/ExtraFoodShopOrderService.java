package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public class ExtraFoodShopOrderService implements OrderService {

    public boolean process(OrderRequest orderRequest, Map<String, Integer> productsAvailable){
        System.out.println("Process 1");
        return true;
    }
}
