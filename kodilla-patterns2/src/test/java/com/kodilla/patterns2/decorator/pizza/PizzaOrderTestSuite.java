package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal pizzaOrderCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal("15.00"), pizzaOrderCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String pizzaDescription = pizzaOrder.getDescription();

        //Then
        assertEquals("Pizza: dough, tomato sauce, cheese", pizzaDescription);
    }

    @Test
    public void testDoubleCheeseSalamiAndHamPizzaCost() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);

        //When
        BigDecimal pizzaPrice = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal("26.50"), pizzaPrice);
    }

    @Test
    public void testDoubleCheeseSalamiAndHamPizzaDescription() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);

        //When
        String pizzaDescription = pizzaOrder.getDescription();

        //Then
        assertEquals("Pizza: dough, tomato sauce, cheese, extra cheese, extra cheese, salami, ham",
                pizzaDescription);
    }

}
