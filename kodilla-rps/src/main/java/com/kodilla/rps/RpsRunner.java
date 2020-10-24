package com.kodilla.rps;

public class RpsRunner {

    private static Game chooseGame(String choice, String userName, int rounds){
        Game theGame;
        switch (choice) {
            case "1":
            default:
                System.out.println(GameRPS.DESCRIPTION_RPS);
                theGame = new GameRPS(userName, rounds);
                break;
            case "2":
                System.out.println(GameRPSLS.DESCRIPTION_RPSLS);
                theGame = new GameRPSLS(userName, rounds);
                break;
        }
        return theGame;
    }

    public static void main(String[] args) {

        //Game initialised.
        System.out.println("Enter your name:");
        final String USER_NAME = GameAbstract.scanner.next();

        //User choosing number of rounds.
        System.out.println(USER_NAME + ", how many wins/losses rounds do you wish to play?");
        while (!GameAbstract.scanner.hasNextInt()) GameAbstract.scanner.next();
        final int ROUNDS = GameAbstract.scanner.nextInt();

        //User picks one of the two versions of the game
        String choice;
        do {
            System.out.println("Hello " + USER_NAME +
                    ", pick the Game: [1] ROCK-PAPER-SCISSOR [2] ROCK-PAPER-SCISSORS-LIZARD-SPOCK");
            choice = GameAbstract.scanner.next();
        } while (!(choice.equals("1") || choice.equals("2")));

        Game theGame = chooseGame(choice, USER_NAME, ROUNDS);

        //Game itself
        boolean end = false;
        while (!end) {
            System.out.println(theGame.getInstruction() + "\nWhat's your move? " + USER_NAME + ".");
            String s = GameAbstract.scanner.next();
            theGame.userChoice(s);
            theGame.isNextRound();
            end = theGame.isEnd();
        }
    }
}