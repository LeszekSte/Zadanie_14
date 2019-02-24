package zadanie_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteData {


    public void writePlayersList(List player) throws IOException {
        FileWriter file = new FileWriter("stats.csv");
        BufferedWriter bufWriter = new BufferedWriter(file);
        for (Object o : player) {
            bufWriter.write(o.toString());
        }
        bufWriter.close();
        System.out.println("Dane posortowano i zapisano do pliku - stats.csv");
    }
}
