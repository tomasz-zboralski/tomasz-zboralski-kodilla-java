package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public interface OrderService {
    boolean process(OrderRequest orderRequest, Map<String, Integer> productsAvailable);
}
