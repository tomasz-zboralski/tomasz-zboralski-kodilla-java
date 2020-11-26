package com.kodilla.rps;

public class RpsRunner {

    private static String initialiseGame() {
        System.out.println("Enter your name:");
        return GameAbstract.scanner.next();
    }

    private static int roundsNumber(String userName) {
        System.out.println(userName + ", how many wins/losses rounds do you wish to play?");
        while (!GameAbstract.scanner.hasNextInt()) GameAbstract.scanner.next();
        return GameAbstract.scanner.nextInt();
    }

    private static Game chooseGame(String userName, int rounds){
        String choice;
        do {
            System.out.println("Hello " + userName +
                    ", pick the Game: [1] ROCK-PAPER-SCISSOR [2] ROCK-PAPER-SCISSORS-LIZARD-SPOCK");
            choice = GameAbstract.scanner.next();
        } while (!(choice.equals("1") || choice.equals("2")));
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

    private static void runGame(String userName, Game theGame){
        boolean end = false;
        while (!end) {
            System.out.println(theGame.INSTRUCTION + "\nWhat's your move? " + userName + ".");
            String s = GameAbstract.scanner.next();
            theGame.userChoice(s);
            theGame.isNextRound();
            end = theGame.isEnd();
        }
    }

    public static void main(String[] args) {

        final String USER_NAME = initialiseGame();
        final int ROUNDS = roundsNumber(USER_NAME);

        Game theGame = chooseGame(USER_NAME, ROUNDS);
        runGame(USER_NAME, theGame);
    }
}