package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

abstract class GameAbstract implements Game{

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    boolean end = false;
    int wins = 0;
    int losses = 0;
    int ties = 0;
    final String name;
    final int rounds;

    public GameAbstract(String name, int rounds) {
        this.name = name;
        this.rounds = rounds;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getTies() {
        return ties;
    }

    public String getInstruction() {
        return "[1] Scissors, [2] Paper, [3] Rock [n] New Game, [x] Exit Game";
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public void isNextRound() {
        if ( wins >= rounds || losses >= rounds ) {
            getTheGameWinner();
        }
    }

    public void userChoice(String s) {
        switch (s) {
            case "n":
                System.out.println("\nAre you sure? [y] yes");
                s = scanner.next();
                if (s.equals("y")) {
                    System.out.println("\n\nLet's try again, then...\n");
                    RpsRunner.main(new String[0]);
                }
                break;
            case "x":
                System.out.println("\nAre you sure? [y] yes");
                s = scanner.next();
                if (s.equals("y")) {
                    System.out.println("Exit...");
                    System.exit(0);
                }
                break;
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                userMove(s);
                break;
            default:
                System.out.println("Try again...");
                break;
        }
    }
    abstract void userMove(String s);

    public void getTheGameWinner() {
        int result = getWins() - getLosses();
        System.out.println("\nGAME OVER");
        System.out.println("Score: " + getLosses() + ":" + getWins() + " [ties: " + getTies() + "]");
        if (result > 0) {
            System.out.println("You're the winner!");
        } else if (result < 0) {
            System.out.println("You lost! :(");
        } else {
            System.out.println("It's a tie!");
        }

        String choice;
        do {
            System.out.println("\nPress: [n] New Game, [x] Exit Game");
            choice = scanner.next();

        } while ((!choice.equals("n")) && (!choice.equals("x")));
        if (choice.equals("n")) RpsRunner.main(new String[0]);
        if (choice.equals("x")) setEnd(true);
    }
}

