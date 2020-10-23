package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;

public class GameRPS extends GameAbstract {

    public GameRPS(String name, int rounds) {
        super(name, rounds);

    }

    public String getInstruction() {
         return "[1] Scissors, [2] Paper, [3] Rock [n] New Game, [x] Exit Game";
    }

    void userMove(String s) {
        switch (s) {
            case "1":
            case "2":
            case "3":
                int computerMove = random.nextInt(3);
                int i = Integer.parseInt(s) - 1;
                roundWinner(computerMove, i);
                break;
            default:
                System.out.println("Try again...");
                break;
        }
    }

    public String numberToName(int i){
        Map<Integer, String> names = new HashMap<>();
        names.put(0, "Scissors");
        names.put(1, "Paper");
        names.put(2, "Rock");
        return names.get(i);
    }

    public void roundWinner(int computerMove, int userMove){
        int result = (computerMove - userMove + 3) % 3;
        System.out.println("Computer: " + numberToName(computerMove) + " " + name + ": " + numberToName(userMove));
        if (result == 0) {
            ties++;
            System.out.println("It's a tie!");
        }
        if (result == 1) {
            wins++;
            System.out.println("You scored!");
        }
        if (result == 2) {
            losses++;
            System.out.println("Computer scored!");
        }
        System.out.println("Score: " + losses + ":" + wins + " [ties: " + ties + "]\n");
    }
}
