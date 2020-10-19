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


//    public String getInstruction() {
//        return instruction;
//    }
//
//    public boolean isEnd() {
//        return end;
//    }
//
//    public void isNextRound() {
//        if ( wins >= rounds || losses >= rounds ) getTheGameWinner();
//    }
//
//    public void userChoice(String s) {
//        if (s.equals("n")) {
//            System.out.println("\nAre you sure? [y] yes");
//            s = scanner.next();
//            if (s.equals("y")) {
//                System.out.println("\n\nLet's try again, then...\n");
//                RpsRunner.main(new String[0]);
//            }
//        } else if (s.equals("x")) {
//            System.out.println("\nAre you sure? [y] yes");
//            s = scanner.next();
//            if (s.equals("y")) {
//                System.out.println("Exit...");
//                end = true;
//                //System.exit(0);
//            }
//        } else if (s.equals("1") || s.equals("2") || s.equals("3") ){
//            int computerMove = random.nextInt(3);
//            int i = Integer.parseInt(s);
//            roundWinner(computerMove, i - 1 );
//        } else {
//            System.out.println("Try again...");
//        }
//    }
//
//    private String numberToName(int i){
//        if (i == 0) return "Scissor";
//        if (i == 1) return "Paper";
//        if (i == 2) return "Rock";
//        return null;
//    }
//
//    public void roundWinner(int computerMove, int userMove){
//        int result = (computerMove - userMove + 3) % 3;
//        if (result == 0) ties++;
//        if (result == 1) wins++;
//        if (result == 2) losses++;
//        System.out.println("Computer: " + numberToName(computerMove) + " " + name + ": " + numberToName(userMove));
//        System.out.println("Score: " + losses + ":" + wins + " [ties: " + ties + "]\n");
//    }

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
