package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {

        //Given
        Book book1 = new Book(
                "Mario Puzo", "The Godfather",
                1969, "Signature1");
        Book book2 = new Book(
                "Yuval Noah Harari", "Sapiens: A Brief History of Humankind",
                2011, "Signature2");
        Book book3 = new Book(
                "Stephen Hawking", "A Brief History of Time",
                1988, "Signature3");
        Book book4 = new Book(
                "Stanislaw Lem", "Niezwyciezony",
                1964, "Signature4");
        Book book5 = new Book(
                "Andrzej Pilipiuk", "Kroniki Jakuba Wedrowycza",
                2002, "Signature5");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int bookMedian = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(1988, bookMedian);
    }
}
