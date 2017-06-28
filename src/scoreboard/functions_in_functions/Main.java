package scoreboard.functions_in_functions;

public class Main {

    public static void main(String... args) {

        Functions.LineReader impureReader = () -> System.console().readLine();

        Functions.LineWriter impureWriter = (line) -> System.out.println(line);
        Functions.printScoreBoard(impureWriter,
            Functions.updateModelByCommand(Functions.translateInputStringToCommand(impureReader)));
    }
}
