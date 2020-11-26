package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BookOrderService implements OrderService{

    public boolean order(User user, Book book, LocalDateTime orderDate) {
        System.out.println("\"" + book.getTitle() + "\"" + " has been ordered" +
                " by " + user.getNICKNAME() + ", " +
                orderDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        return true;
    }
}
