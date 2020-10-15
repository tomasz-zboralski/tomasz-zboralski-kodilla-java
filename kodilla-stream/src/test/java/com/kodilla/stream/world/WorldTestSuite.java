package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given

        //Europe
        List<Country> countriesEurope = new ArrayList<>();
        Country country1 = new Country("Germany", new BigDecimal("80457737"));
        Country country2 = new Country("France", new BigDecimal("67364357"));
        Country country3 = new Country("UK", new BigDecimal("65105256"));

        countriesEurope.add(country1);
        countriesEurope.add(country2);
        countriesEurope.add(country3);

        //Asia
        List<Country> countriesAsia = new ArrayList<>();
        Country country4 = new Country("China", new BigDecimal("1401585247"));
        Country country5 = new Country("India", new BigDecimal("1359527235"));
        Country country6 = new Country("Indonesia", new BigDecimal("262787403"));

        countriesAsia.add(country4);
        countriesAsia.add(country5);
        countriesAsia.add(country6);

        //North America
        List<Country> countriesNA = new ArrayList<>();
        Country country7 = new Country("USA", new BigDecimal("329256465"));
        Country country8 = new Country("Canada", new BigDecimal("35881659"));

        countriesNA.add(country7);
        countriesNA.add(country8);


        World theWorld = new World();
        Continent continent1 = new Continent("Europe", countriesEurope);
        Continent continent2 = new Continent("Asia", countriesAsia);
        Continent continent3 = new Continent("North America", countriesNA);

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
