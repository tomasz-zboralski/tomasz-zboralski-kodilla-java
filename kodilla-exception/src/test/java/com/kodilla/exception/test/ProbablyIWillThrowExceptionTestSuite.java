package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProbablyIWillThrowExceptionTestSuite {

    @Test
    void whenTestedMethodShouldTrowException(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        Assertions.assertAll (
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3,1)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0,10)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1,1.5)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5,1.5))
        );

    }

    @Test
    void whenTestedMethodDoesNotTrowException(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        Assertions.assertAll(
                () -> Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,2)),
                () -> Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5,1))
        );
    }
}
