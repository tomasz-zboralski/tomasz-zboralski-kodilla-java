package com.kodilla.rps;

//import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
//        System.out.println((0-2)%3);
//        System.out.println((0-1 )%3);
//        System.out.println((1-2)%3);
//        System.out.println((1-0)%3);
//        System.out.println((2-1)%3);
//        System.out.println((2-0)%3);
//        System.out.println(" ");
//        System.out.println((0-2 +3)%3);
//        System.out.println((0-1 +3)%3);
//        System.out.println((1-2 +3)%3);
//        System.out.println((1-0 +3)%3);
//        System.out.println((2-1 +3)%3);
//        System.out.println((2-0 +3)%3);
//
//        System.out.println(2%5);

        Scanner scanner = new Scanner(System.in);
        boolean end = false;

        System.out.println("Enter name:");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + ", how many wins/losses rounds do you wish to play?");
        int roundsNumber = scanner.nextInt();

        Game theGame = new Game(userName, roundsNumber);

        while (!end) {
            System.out.println(theGame.getInstruction() + "\nWhat's your move? " + userName + ".");
            String s = scanner.next();
            theGame.userChoice(s);
            theGame.isNextRound();
            end = theGame.isEnd();
        }
    }
}
