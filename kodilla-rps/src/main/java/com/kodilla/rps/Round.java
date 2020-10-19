package com.kodilla.rps;

import java.util.Random;

public class Round {
    Random random = new Random();
    int computerMove = random.nextInt(4);
    private int userMove;




    public Round(int userMove) {
        this.userMove = userMove;
    }

    public void isWinner(int computerMove, int userMove){

    }
}
