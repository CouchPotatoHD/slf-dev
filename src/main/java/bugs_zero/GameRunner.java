package bugs_zero;

import java.util.Random;

public class GameRunner {

    private static boolean notAWinner = true;

    public static void main(String[] args) {
        Random rand = new Random();
        playGame(rand);

    }

    public static void playGame(Random rand) {
        Game aGame = new Game();

        aGame.add("Chet");
        aGame.add("Pat");
        aGame.add("Sue");

        if (aGame.isPlayable()){

            while (notAWinner){

                aGame.roll(rand.nextInt(5) + 1);

                if (rand.nextInt(9) == 7) {
                    notAWinner = aGame.wrongAnswer();
                } else {
                    notAWinner = aGame.wasCorrectlyAnswered();
                }

            }

        } else {
            System.out.println("MIN NUMBER OF PLAYERS IS " + aGame.getMIN_PLAYERS() + " AND MAX IS " + aGame.getMAX_PLAYERS());
        }


//        do {
//
//            aGame.roll(rand.nextInt(5) + 1);
//
//            if (rand.nextInt(9) == 7) {
//                notAWinner = aGame.wrongAnswer();
//            } else {
//                notAWinner = aGame.wasCorrectlyAnswered();
//            }
//        } while (notAWinner);
    }
}
