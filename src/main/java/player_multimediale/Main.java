package player_multimediale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LettoreMultimediale lettore = new LettoreMultimediale();
        lettore.inserisciElementi();
        lettore.esegui();
    }
}
