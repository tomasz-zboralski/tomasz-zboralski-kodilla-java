package com.kodilla.rps;

interface Game {
    String INSTRUCTION = GameAbstract.INSTRUCTION;

    int getWins();
    int getLosses();
    int getTies();
    //String getInstruction();
    String numberToName(int i);
    boolean isEnd();

    void setEnd(boolean end);
    void isNextRound();
    void userChoice(String s);
    void roundWinner(int computerMove, int userMove);
}