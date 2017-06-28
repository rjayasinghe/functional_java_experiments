package scoreboard.lazy_and_pure;

public class Main {

    public static void main(String... args) {

        ListOfCommands i = ListOfCommands.create();

        while (i.hasNext(System.console())) {
            i.executeIO(System.console());
        }
    }
}
