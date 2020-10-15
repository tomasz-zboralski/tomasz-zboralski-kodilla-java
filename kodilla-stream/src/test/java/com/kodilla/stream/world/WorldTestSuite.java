package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        //Europe
        Continent continent1 = new Continent("Europe");
        Country country1 = new Country("Germany", new BigDecimal("80457737"));
        Country country2 = new Country("France", new BigDecimal("67364357"));
        Country country3 = new Country("UK", new BigDecimal("65105256"));

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);

        //Asia
        Continent continent2 = new Continent("Asia");
        Country country4 = new Country("China", new BigDecimal("1401585247"));
        Country country5 = new Country("India", new BigDecimal("1359527235"));
        Country country6 = new Country("Indonesia", new BigDecimal("262787403"));

        continent2.addCountry(country4);
        continent2.addCountry(country5);
        continent2.addCountry(country6);

        //North America
        Continent continent3 = new Continent("North America");
        Country country7 = new Country("USA", new BigDecimal("329256465"));
        Country country8 = new Country("Canada", new BigDecimal("35881659"));

        continent3.addCountry(country7);
        continent3.addCountry(country8);

        //World
        World theWorld = new World();

        theWorld.addContinent(continent1);
        theWorld.addContinent(continent2);
        theWorld.addContinent(continent3);

        //When
        BigDecimal totalPeople = theWorld.getPeopleQuantity();
        BigDecimal expectedPeopleQuantity = new BigDecimal("3601965359");

        //Then
        Assertions.assertEquals(expectedPeopleQuantity, totalPeople);
    }
}
