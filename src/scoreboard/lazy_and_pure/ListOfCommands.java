package scoreboard.lazy_and_pure;

import java.io.Console;


public class ListOfCommands {

    static ListOfCommands create() {

        return new ListOfCommands();
    }


    public boolean hasNext(Console console) {

        return false;
    }


    public void executeIO(Console console) {
    }
}
