package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public class DistributionProcessor {

    OrderService orderService;

    public DistributionProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        Distributor distributor = orderRequest.getDistributor();
        Map<String, Integer> productsAvailable = distributor.getPRODUCTS();

        boolean isOrdered = orderService.process(orderRequest, productsAvailable);

        if (isOrdered) {
            return new OrderDto(distributor, true);
        } else {
            return new OrderDto(distributor, false);
        }
    }
}
