package scoreboard.functions_in_functions;

import java.util.function.Function;


public class Main {

    public static void main(String... args) {

        Functions.LineReader impureReader = () -> System.console().readLine();

        Functions.LineWriter impureWriter = (line) -> System.out.println(line);

        final Function<ScoreBoard, ScoreBoard> scoreBoardScoreBoardFunction = Functions.printScoreBoard(impureWriter,
                Functions.updateModelByCommand(Functions.translateInputStringToCommand(impureReader)));

        final ScoreBoard nextScoreBoard = scoreBoardScoreBoardFunction.apply(new ScoreBoard());

        // TODO create function with loop and it gets the function from ScoreBoard to ScoreBoard
        // and runs the loop.
    }
}
