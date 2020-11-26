package com.kodilla.good.patterns.challenges;

public class Book {
    private final String author;
    private final String title;
    private final int yearOfPublication;
    private final String signature;

    public Book(final String author, final String title, final int yearOfPublication, final String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", signature='" + signature + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }
}