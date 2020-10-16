package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] elements = {34, 53, 54, 43, 45, 43, 42, 65, 88, 99, 90, 87, 65, 54, 35, 34, 43, 34, 54, 65};

        //When
        double averageResult = ArrayOperations.getAverage(elements);
        double averageExpected = 56.35;

        //Then
        Assertions.assertEquals(averageExpected, averageResult);

    }
}
