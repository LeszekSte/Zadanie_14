package zadanie_2;

import java.util.*;

public class InputData {

    Scanner sc = new Scanner(System.in);

    public ArrayList writeData() {
        List player = new ArrayList<Person>();
        final String koniec = "STOP";
        int i = 0;
        String lName = null;
        String fName = null;
        int pl = 0;
        boolean end = false;
        do {
            i++;
            System.out.printf("%d. Podaj nazwisko zawodnika - (lub stop)\n", i);
            lName = sc.nextLine().toUpperCase();
            if (lName.equals(koniec)) end = true;

            if (!end) {
                System.out.printf("Podaj imię zawodnika\n", i);
                fName = sc.nextLine().toUpperCase();
                boolean ok = false;
                do {
                    try {
                        System.out.printf("Podaj miejsce %d zawodnika\n", i);
                        pl = sc.nextInt();
                        if (pl<=0)
                            throw  new InputMismatchException() ;
                        ok = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Podaj tylko liczby całkowite większe od zera");
                    } finally {
                        sc.nextLine();
                    }
                } while (!ok);
            }

            if (!end) {
                player.add(new Person(fName, lName, pl));
            }
        } while (!end);
        Collections.sort(player);
        return (ArrayList) player;
    }
}
