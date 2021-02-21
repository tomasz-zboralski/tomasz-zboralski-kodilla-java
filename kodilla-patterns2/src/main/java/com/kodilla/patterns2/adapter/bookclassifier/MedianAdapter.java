package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    public int publicationYearMedian(Set<Book> bookSet) {

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> bookMap = bookSet.stream()
                .collect(Collectors.toMap(
                        b -> new BookSignature(b.getSignature()),
                        b -> new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(
                                b.getAuthor(), b.getTitle(), b.getPublicationYear())
                        )
                );

        return medianPublicationYear(bookMap);
    }

}
