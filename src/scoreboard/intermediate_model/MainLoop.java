package scoreboard.intermediate_model;

import static scoreboard.intermediate_model.Pure.computeNextScoreBoard;


public class MainLoop {

    // impure
    public static void main(String... args) {

        ScoreBoard scoreBoard = new ScoreBoard();

        while (scoreBoard.inGame) {
            String readLine = readline();

            Update update = computeNextScoreBoard(readLine, scoreBoard);
            scoreBoard = update.scoreBoard;

            String toBePrintedLine = update.line;

            System.out.println(toBePrintedLine);
        }
    }


    // impure
    private static String readline() {

        return null;
    }
}
