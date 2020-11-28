package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public class OrderRequest {
    private Map<String, Integer> products;
    private Distributor distributor;

    public OrderRequest(Distributor distributor, Map<String, Integer> products) {
        this.products = products;
        this.distributor = distributor;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public Distributor getDistributor() {
        return distributor;
    }
}
