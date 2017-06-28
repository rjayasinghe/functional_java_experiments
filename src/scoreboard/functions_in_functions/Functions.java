package scoreboard.functions_in_functions;

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


    static Supplier<Update2> updateModelByCommand(Supplier<Command2> commands) {

        return () -> {
            // TODO switch
        };
    }

    interface LineReader extends Supplier<String> {
    }
}
