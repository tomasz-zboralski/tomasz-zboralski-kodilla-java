package com.kodilla.rps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoundWinnerTestSuit {

    @Test
    void testRoundWinnerRSP() {
        //When
        GameRPS game = new GameRPS("Test", 10);

        //Given
        game.roundWinner(0, 2);// (0-2) Scissors vs Rock = Win
        // (0-1) Scissors vs Paper = Lost
        // (1-2) Paper vs Rock = Lost
        // (1-0) Paper vs Scissors = Win
        // (2-1) Rock vs Paper = Win
        // (2-0) Rock vs Scissors = Lost

        //Then
        Assertions.assertEquals(1, game.getWins());

    }
}
