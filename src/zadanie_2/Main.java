package zadanie_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        InputData inputData = new InputData();
        List player = new ArrayList<Person>(inputData.writeData());

        WriteData writeData = new WriteData();
        writeData.writePlayersList(player);

    }
}
