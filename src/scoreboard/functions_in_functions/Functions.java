package scoreboard.functions_in_functions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class Functions {

    // TODO how to test without a mocked linereader?
    static Supplier<Command2> translateInputStringToCommand(LineReader lines) {

        return () -> {
            String line = lines.get();

            // TODO switch
            return Command2.SELECT_A;
        };
    }


    static Function<ScoreBoard, ScoreBoard> updateModelByCommand(Supplier<Command2> commands) {

        return
            (sb) -> {
            Command2 c = commands.get();

            switch (c) {
                case SELECT_A:
                    return sb.selectTeam(0);
            }

            return null; // TODO ScoreBoad.abort();
        };
    }


    static Consumer<ScoreBoard> printScoreBoard(LineWriter lineWriter,
        Function<ScoreBoard, ScoreBoard> scoreBoardScoreBoardFunction) {

        return (oldSb) -> lineWriter.accept(oldSb.line);
    }

    interface LineReader extends Supplier<String> {

        // suppliers providing more than a constant value are impure
    }

    interface LineWriter extends Consumer<String> {

        // consumers have side effects by definition
    }
}
