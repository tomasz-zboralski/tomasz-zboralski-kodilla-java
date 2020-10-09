package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: ShapeCollector Test Suit")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTest(){
        System.out.println("All test are finished");
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter ++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Test for Circle")
    class TestCircle {

        @DisplayName("Check if number of figures is 1 when added")
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector aShape = new ShapeCollector();

            //When
            aShape.addFigure(new Circle("Circle", 113.094));

            //Then
            Assertions.assertEquals(1, aShape.getShapesCollectionQuantity());

        }

        @DisplayName("Check if the selected figure was successfully removed from the list.")
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector aShape = new ShapeCollector();
            Circle aCircle = new Circle("Circle", 113.094);
            aShape.addFigure(aCircle);

            //When
            boolean result = aShape.removeFigure(aCircle);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, aShape.getShapesCollectionQuantity());
        }

        @DisplayName("Check if an attempt to delete a non-existent figure will return: false.")
        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector aShape = new ShapeCollector();
            Circle aCircle = new Circle("Circle", 113.094);

            //When
            boolean result = aShape.removeFigure(aCircle);

            //Then
            Assertions.assertFalse(result);
        }


        @DisplayName("Check if given figure is equal to figure added to the list")
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector aShape = new ShapeCollector();
            Circle aCircle = new Circle("Circle", 113.094);
            aShape.addFigure(aCircle);

            //When
            Shape retrievedCircle = aShape.getFigure(0);

            //Then
            Assertions.assertEquals(aCircle, retrievedCircle);
        }


    }

    @Nested
    @DisplayName("Test for Square")
    class TestSquare {

        @DisplayName("Check if number of figures is 1 when added")
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector aShape = new ShapeCollector();

            //When
            aShape.addFigure(new Square("Square", 36));

            //Then
            Assertions.assertEquals(1, aShape.getShapesCollectionQuantity());

        }

        @DisplayName("Check if the selected figure was successfully removed from the list.")
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector aShape = new ShapeCollector();
            Square aSquare = new Square("Square", 36);
            aShape.addFigure(aSquare);

            //When
            boolean result = aShape.removeFigure(aSquare);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, aShape.getShapesCollectionQuantity());
        }

        @DisplayName("Check if an attempt to delete a non-existent figure will return: false.")
        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector aShape = new ShapeCollector();
            Square aSquare = new Square("Square", 36);

            //When
            boolean result = aShape.removeFigure(aSquare);

            //Then
            Assertions.assertFalse(result);
        }


        @DisplayName("Check if given figure is equal to figure added to the list")
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector aShape = new ShapeCollector();
            Square aSquare = new Square("Square", 36);
            aShape.addFigure(aSquare);

            //When
            Shape retrievedSquare = aShape.getFigure(0);

            //Then
            Assertions.assertEquals(aSquare, retrievedSquare);
        }


    }

    @Nested
    @DisplayName("Test for Triangle")
    class TestTriangle {

        @DisplayName("Check if number of figures is 1 when added")
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector aShape = new ShapeCollector();

            //When
            aShape.addFigure(new Triangle("Triangle", 15.59));

            //Then
            Assertions.assertEquals(1, aShape.getShapesCollectionQuantity());

        }

        @DisplayName("Check if the selected figure was successfully removed from the list.")
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector aShape = new ShapeCollector();
            Triangle aTriangle = new Triangle("Triangle", 15.59);
            aShape.addFigure(aTriangle);

            //When
            boolean result = aShape.removeFigure(aTriangle);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, aShape.getShapesCollectionQuantity());
        }

        @DisplayName("Check if an attempt to delete a non-existent figure will return: false.")
        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector aShape = new ShapeCollector();
            Triangle aTriangle = new Triangle("Triangle", 15.59);

            //When
            boolean result = aShape.removeFigure(aTriangle);

            //Then
            Assertions.assertFalse(result);
        }


        @DisplayName("Check if given figure is equal to figure added to the list")
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector aShape = new ShapeCollector();
            Triangle aTriangle = new Triangle("Triangle", 15.59);            aShape.addFigure(aTriangle);

            //When
            Shape retrievedTriangle = aShape.getFigure(0);

            //Then
            Assertions.assertEquals(aTriangle, retrievedTriangle);
        }


    }

    @DisplayName("Check if the method return String with all shapes names in the list")
    @Test
    void testShowFigures() {
        //Given
        ShapeCollector aShape = new ShapeCollector();
        Circle aCircle = new Circle("Circle", 113.094);
        Square aSquare = new Square("Square", 36);
        Triangle aTriangle = new Triangle("Triangle", 15.59);
        aShape.addFigure(aCircle);
        aShape.addFigure(aSquare);
        aShape.addFigure(aTriangle);

        //When
        String expectedResult = "[Shape: Circle, Shape: Square, Shape: Triangle]";

        //Then
        Assertions.assertEquals(expectedResult, aShape.showFigures());
    }


}
