package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private Book book;
    private LocalDateTime date;


    public OrderRequest(User user, Book book, LocalDateTime date) {
        this.user = user;
        this.date = date;
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Book getBook() {
        return book;
    }
}
