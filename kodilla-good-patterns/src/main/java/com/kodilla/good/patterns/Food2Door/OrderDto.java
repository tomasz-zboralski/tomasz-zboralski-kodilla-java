package com.kodilla.good.patterns.Food2Door;

public class OrderDto {
    public Distributor distributor;
    public boolean isOrdered;

    public OrderDto(final Distributor distributor, final boolean isOrdered) {
        this.distributor = distributor;
        this.isOrdered = isOrdered;
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
