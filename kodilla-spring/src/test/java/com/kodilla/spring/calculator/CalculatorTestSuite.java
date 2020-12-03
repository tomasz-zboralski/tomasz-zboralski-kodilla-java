package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double resultAdd = calculator.add(2,2);
        double resultSub = calculator.sub(2,2);
        double resultMul = calculator.mul(2,2);
        double resultDiv = calculator.div(2,2);
        //Then
        Assertions.assertAll(
                () -> assertEquals(4, resultAdd),
                () -> assertEquals(0, resultSub),
                () -> assertEquals(4, resultMul),
                () -> assertEquals(1, resultDiv)

        );

    }

}
