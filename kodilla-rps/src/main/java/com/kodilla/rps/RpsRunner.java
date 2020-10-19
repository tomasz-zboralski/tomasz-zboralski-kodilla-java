package com.kodilla.rps;

//import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        Game theGame = null;

        System.out.println("Enter your name:");
        String userName = scanner.nextLine();
        System.out.println(userName + ", how many wins/losses rounds do you wish to play?");

        while (!scanner.hasNextInt()) scanner.next();
        int roundsNumber = scanner.nextInt();


        String choice;
        do {
            System.out.println("Hello " + userName + ", pick the Game: [1] ROCK-PAPER-SCISSOR [2] ROCK-PAPER-SCISSORS-LIZARD-SPOCK");
            choice = scanner.next();

        } while ((!choice.equals("1")) && (!choice.equals("2")));
        if (choice.equals("1")) {
            System.out.println("It's simple. Rock breaks scissors, scissors cuts paper, paper covers rock.");
            theGame = new GameRSP(userName, roundsNumber);
        }
        if (choice.equals("2")) {
            System.out.println("It's very simple. Scissors cuts paper.\n" +
                    "Paper covers rock. Rock crushes lizard.\n" +
                    "Lizard poisons Spock. Spock smashes scissors.\n" +
                    "Scissors decapitates lizard. Lizard eats paper.\n" +
                    "Paper disproves Spock. Spock vaporizes rock.\n" +
                    "And as it always has, rock crushes scissors.\n");
            theGame = new GameRPSLS(userName, roundsNumber);
        }

        while (!end) {
            System.out.println(theGame.getInstruction() + "\nWhat's your move? " + userName + ".");
            String s = scanner.next();
            theGame.userChoice(s);
            theGame.isNextRound();
            end = theGame.isEnd();
        }
    }
}
