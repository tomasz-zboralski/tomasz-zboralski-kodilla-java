package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public class Distributor {

    private final String NAME;
    private final String ADDRESS;
    private final Map<String,Integer> PRODUCTS;

    public Distributor(String NAME, String ADDRESS, Map<String, Integer> PRODUCTS) {
        this.NAME = NAME;
        this.ADDRESS = ADDRESS;
        this.PRODUCTS = PRODUCTS;
    }

    public String getNAME() {
        return NAME;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public Map<String, Integer> getPRODUCTS() {
        return PRODUCTS;
    }
}
