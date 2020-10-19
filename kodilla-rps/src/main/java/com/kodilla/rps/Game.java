package com.kodilla.rps;
import java.util.Random;
import java.util.Scanner;


interface Game {
    //Random random = new Random();
    //Scanner scanner = new Scanner(System.in);

    String getInstruction();
    boolean isEnd();
    void isNextRound();
    void userChoice(String s);
    String numberToName(int i);
    void roundWinner(int computerMove, int userMove);
    void getTheGameWinner();






//    private boolean end = false;
//    private int wins = 0;
//    private int losses = 0;
//    private int ties = 0;
//    private String name;
//    private int rounds;
//    private String instruction = "[1] Scissors, [2] Paper, [3] Rock [n] New Game, [x] Exit Game";


    //interface Game(String name, int rounds) {

        //void getTheGameWinner();

    }
//        this.rounds = rounds;
//        this.name = name;




//    default void getTheGameWinner(){
//        int result = wins - losses;
//        System.out.println("\nGAME OVER");
//        System.out.println("Score: " + losses + ":" + wins + " [ties: " + ties + "]");
//        if (result > 0) {
//            System.out.println("You're the winner!");
//        } else if (result < 0) {
//            System.out.println("You lost! :(");
//        } else {
//            System.out.println("It's a tie!");
//        }
//
//        String choice;
//        do {
//            System.out.println("\nPress: [n] New Game, [x] Exit Game");
//            choice = scanner.next();
//
//        } while ((!choice.equals("n")) && (!choice.equals("x")));
//        if (choice.equals("n")) RpsRunner.main( new String[0]);
//        if (choice.equals("x")) end = true;
//            //System.exit(0);
//    }
//}
