package com.kodilla.good.patterns.Food2Door;


import java.util.HashMap;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        HashMap<String, Integer> productsAvailable = new HashMap<>();
        productsAvailable.put("Carrots", 100);
        productsAvailable.put("Apple", 5);
        productsAvailable.put("Eggs", 100);

        Distributor distributor = new Distributor("Extra Food Shop", "Kraków", productsAvailable);

        HashMap<String, Integer> productsOrdered = new HashMap<>();
        productsOrdered.put("Carrots",5);
        productsOrdered.put("Apple", 10);
        productsOrdered.put("Banana", 9);

        return new OrderRequest(distributor, productsOrdered);
    }
}
