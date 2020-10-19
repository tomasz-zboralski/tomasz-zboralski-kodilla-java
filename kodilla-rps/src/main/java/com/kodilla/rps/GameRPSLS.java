package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class GameRPSLS implements Game{

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    private boolean end = false;
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;
    private String name;
    private int rounds;
    private String instruction = "[1] Rock, [2] Spock, [3] Paper, [4] Lizard, [5] Scissors, [n] New Game, [x] Exit Game";


    public GameRPSLS(String name, int rounds) {
        this.rounds = rounds;
        this.name = name;
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
        return instruction;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public void isNextRound() {
        if ( wins >= rounds || losses >= rounds ) getTheGameWinner();
    }

    public void userChoice(String s) {
        if (s.equals("n")) {
            System.out.println("\nAre you sure? [y] yes");
            s = scanner.next();
        }
        if (s.equals("y")) {
                System.out.println("\n\nLet's try again, then...\n");
                RpsRunner.main(new String[0]);
            }
        if (s.equals("x")) {
            System.out.println("\nAre you sure? [y] yes");
            s = scanner.next();
        }
        if (s.equals("y")) {
                System.out.println("Exit...");
                System.exit(0);
            }
        if (s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") ){
            int computerMove = random.nextInt(5);
            int i = Integer.parseInt(s);
            roundWinner(computerMove, i - 1 );
        } else {
            System.out.println("Try again...");
        }
    }

    public String numberToName(int i){
        if (i == 0) return "Rock";
        if (i == 1) return "Spock";
        if (i == 2) return "Paper";
        if (i == 3) return "Lizard";
        if (i == 4) return "Scissor";
        return null;
    }

    public void roundWinner(int computerMove, int userMove){
        int result = (computerMove - userMove + 5) % 5;
        System.out.println("Computer: " + numberToName(computerMove) + " " + name + ": " + numberToName(userMove));
        if (result == 0) {
            ties++;
            System.out.println("It's a tie!");
        }
        if (result == 1 || result == 2) {
            losses++;
            System.out.println("Computer scored!");
        }
        if (result == 3 || result == 4) {
            wins++;
            System.out.println("You scored!");
        }
        System.out.println("Score: " + losses + ":" + wins + " [ties: " + ties + "]\n");
    }
}

