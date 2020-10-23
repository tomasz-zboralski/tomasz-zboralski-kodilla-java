package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String descriptionRPSLS = "It's very simple. Scissors cuts paper.\n" +
                "Paper covers rock. Rock crushes lizard.\n" +
                "Lizard poisons Spock. Spock smashes scissors.\n" +
                "Scissors decapitates lizard. Lizard eats paper.\n" +
                "Paper disproves Spock. Spock vaporizes rock.\n" +
                "And as it always has, rock crushes scissors.\n";

        String descriptionRPS = "It's simple. Rock breaks scissors, scissors cuts paper, paper covers rock.";

        //Game initialised.
        System.out.println("Enter your name:");
        String userName = scanner.next();

        //User choosing number of rounds.
        System.out.println(userName + ", how many wins/losses rounds do you wish to play?");
        while (!scanner.hasNextInt()) scanner.next();
        int roundsNumber = scanner.nextInt();

        //User picks one of the two versions of the game
        String choice;
        do {
            System.out.println("Hello " + userName +
                    ", pick the Game: [1] ROCK-PAPER-SCISSOR [2] ROCK-PAPER-SCISSORS-LIZARD-SPOCK");
            choice = scanner.next();

        } while (!(choice.equals("1") || choice.equals("2")));

        Game theGame = new GameRPS(userName, roundsNumber);

        switch (choice) {
            case "1":
                System.out.println(descriptionRPS);
                theGame = new GameRPS(userName, roundsNumber);
                break;
            case "2":
                System.out.println(descriptionRPSLS);
                theGame = new GameRPSLS(userName, roundsNumber);
                break;
        }

        //Game itself
        boolean end = false;
        while (!end) {
            System.out.println(theGame.getInstruction() + "\nWhat's your move? " + userName + ".");
            String s = scanner.next();
            theGame.userChoice(s);
            theGame.isNextRound();
            end = theGame.isEnd();
        }
    }
}
