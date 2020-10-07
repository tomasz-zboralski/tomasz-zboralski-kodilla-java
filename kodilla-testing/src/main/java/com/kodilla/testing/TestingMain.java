package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Zadanie: Pierwszy test jednostkowy");

        Calculator calculator = new Calculator();

        int addTest = calculator.add(2,4);
        int subTest = calculator.subtract(4,2);

        if (addTest == 6){
            System.out.println("Test ok!");
        } else {
            System.out.println("Error!");
        }

        if (subTest == 2){
            System.out.println("Test ok!");
        } else {
            System.out.println("Error!");
        }
    }
}
