package com.kodilla.rps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoundWinnerTestSuit {

    @Test
    void testRoundWinnerRSP() {
        //When
        GameRPS game = new GameRPS("Test", 6);

        //Given
        game.roundWinner(0, 2); // (0-2) Scissors vs Rock = Win
        game.roundWinner(1, 0); // (1-0) Paper vs Scissors = Win
        game.roundWinner(2, 1); // (2-1) Rock vs Paper = Win
        game.roundWinner(0, 1); // (0-1) Scissors vs Paper = Lost
        game.roundWinner(1, 2); // (1-2) Paper vs Rock = Lost
        game.roundWinner(2, 0); // (2-0) Rock vs Scissors = Lost

        //Then
        Assertions.assertAll(
                () -> Assertions.assertEquals(3, game.getWins()),
                () -> Assertions.assertEquals(3, game.getLosses())
        );
    }
}
