package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Test Library");

        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(
                        new Book("Test Book " + n, "Test Author" + n, LocalDate.now())));

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Extra Book", "The Author", LocalDate.now()));

        int libraryBooks = library.getBooks().size();
        int deepClonedLibraryBooks = deepClonedLibrary.getBooks().size();

        //Then
        Assertions.assertEquals(11, libraryBooks);
        Assertions.assertEquals(10, deepClonedLibraryBooks);
    }
}
