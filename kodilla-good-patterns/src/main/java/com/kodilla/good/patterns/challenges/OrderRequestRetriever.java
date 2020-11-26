package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        User user = new User("John", "Smith", "j_smith1");
        Book book = new Book("Dylan Murphy", "Wolf of the mountains", 2003, "0001");
        LocalDateTime orderDate = LocalDateTime.now();

        return new OrderRequest(user, book, orderDate);
    }


}
