package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suit")
public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Suit: begin");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Test Suit: end");
    }

    @DisplayName("Check if works with empty list")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator examinedList = new OddNumbersExterminator();

        //When
        List <Integer> result = examinedList.exterminate(emptyList);
        List<Integer> expectedEmptyList = new ArrayList<>();
        System.out.println("Testing empty lists: " + result + " and " + expectedEmptyList);

        //Then
        Assertions.assertEquals(expectedEmptyList, result);

    }

    @DisplayName("Check if works when list has odd and even numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){

        //Given
        List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        OddNumbersExterminator examinedList = new OddNumbersExterminator();

        //When
        List <Integer> result = examinedList.exterminate(numbersList);
        List<Integer> expectedOddNumbers = Arrays.asList(2,4,6,8,10);
        System.out.println("Testing: " + result + " and " + expectedOddNumbers);


        //Then
        Assertions.assertEquals(expectedOddNumbers, result);

    }

}
