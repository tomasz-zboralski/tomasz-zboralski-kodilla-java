package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;

public class GameRPSLS extends GameAbstract{

    public static final String DESCRIPTION_RPSLS = "It's very simple. Scissors cuts paper.\n" +
            "Paper covers rock. Rock crushes lizard.\n" +
            "Lizard poisons Spock. Spock smashes scissors.\n" +
            "Scissors decapitates lizard. Lizard eats paper.\n" +
            "Paper disproves Spock. Spock vaporizes rock.\n" +
            "And as it always has, rock crushes scissors.\n";

    public GameRPSLS(String name, int rounds) {
        super(name, rounds);
    }

    public String getInstruction() {
        return "[1] Rock, [2] Spock, [3] Paper, [4] Lizard, [5] Scissors, [n] New Game, [x] Exit Game";
    }

    void userMove(String s) {
        int computerMove = random.nextInt(5);
        int i = Integer.parseInt(s);
        roundWinner(computerMove, i - 1);
    }

    public String numberToName(int i){
        Map<Integer, String> names = new HashMap<>();
        names.put(0, "Rock");
        names.put(1, "Spock");
        names.put(2, "Paper");
        names.put(3, "Lizard");
        names.put(4, "Scissors");
        return names.get(i);
    }

    public void roundWinner(int computerMove, int userMove){
        int result = (computerMove - userMove + 5) % 5;
        System.out.println("Computer: " + numberToName(computerMove) + " " + USER_NAME + ": " + numberToName(userMove));
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

