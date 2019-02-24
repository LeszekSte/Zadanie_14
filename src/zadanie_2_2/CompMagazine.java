package zadanie_2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompMagazine {

    public static void main(String[] args) {

        List<Computer> computerList = new ArrayList<>();

        computerList.add(new Computer("Lenovo",1.6,80));
        computerList.add(new Computer("Apple",2.66,8));
        computerList.add(new Computer("Apple",2.66,4));
        computerList.add(new Computer("IBM",1.2,16));
        computerList.add(new Computer("Apple",1.2,16));

        printList(computerList);
        // System.out.println(computerList);
        Collections.sort(computerList);
        printList(computerList);
      //  System.out.println(computerList);
    }

    private static void printList(List<Computer> computerList) {
        for (Computer computer : computerList) {
            System.out.println(computer.toString());
        }
        System.out.println();
    }
}
