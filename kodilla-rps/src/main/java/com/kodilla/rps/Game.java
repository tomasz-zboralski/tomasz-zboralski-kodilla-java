package com.kodilla.rps;
import java.util.Scanner;

interface Game {
    Scanner scanner = new Scanner(System.in);

    int getWins();
    int getLosses();
    int getTies();
    String getInstruction();
    boolean isEnd();
    String numberToName(int i);

    void setEnd(boolean end);
    void isNextRound();
    void userChoice(String s);
    void roundWinner(int computerMove, int userMove);

    default void getTheGameWinner() {
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