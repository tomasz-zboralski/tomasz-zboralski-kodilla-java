package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("SESAME_BUN")
                .burgers(1)
                .sauce("standard")
                .ingredients("onion")
                .ingredients("cucumber")
                .ingredients("lettuce")
                .ingredients("cheese")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assertions.assertEquals(4, howManyIngredients);
    }
}
