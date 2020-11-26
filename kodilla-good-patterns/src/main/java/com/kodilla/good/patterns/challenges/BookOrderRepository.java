package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BookOrderRepository implements OrderRepository{
    public boolean createOrder(User user, Book book, LocalDateTime orderDate){
        System.out.println("Record: " + user.getNAME() + " " + user.getSURNAME() +
                " (" + user.getNICKNAME() +
                ") " + book.toString() +
                ", date: " + orderDate);
        return true;
    }
}
