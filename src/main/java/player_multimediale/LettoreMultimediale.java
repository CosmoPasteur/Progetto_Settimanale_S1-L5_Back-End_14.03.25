package player_multimediale;

import java.util.Scanner;

public class LettoreMultimediale {

    private ElementoMultimediale[] elementi = new ElementoMultimediale[5];
    private Scanner scanner = new Scanner(System.in);

    public void inserisciElementi() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento multimediale: (0=uscire, 1=video, 2=immagine, 3=registrazione audio)");
            int scelta = scanner.nextInt();
            if (scelta == 0) {
                System.out.println("Sessione Terminata. 0Arrivederci!");
                break;
            } else if (scelta == 1) {
                System.out.println("Inserisci il titolo del video:");
                String titolo = scanner.next();
                System.out.println("Nome Titolo: " + titolo);
                System.out.println("Inserisci la durata del video:");
                int durata = scanner.nextInt();
                System.out.println("Durata: " + durata + " min");
                System.out.println("Inserisci il volume del video:");
                int volume = scanner.nextInt();
                System.out.println("Volume: " + volume);
                for (int j = 0; j < volume; j++) {
                    System.out.print("!");
                }
                System.out.println();
                System.out.println("Inserisci la luminosita del video:");
                int luminosita = scanner.nextInt();
                System.out.println("Livello di luminosità: " + luminosita);
                for (int j = 0; j < luminosita; j++) {
                    System.out.print("*");
                }
                System.out.println();
                Video video = new Video(titolo, durata, volume, luminosita);
                elementi[i] = video;
            } else if (scelta == 2) {
                System.out.println("Inserisci il titolo dell'immagine:");
                String titolo = scanner.next();
                System.out.println("Nome Titolo: " + titolo);
                System.out.println("Inserisci la luminosita dell'immagine:");
                int luminosita = scanner.nextInt();
                Immagine immagine = new Immagine(titolo, luminosita);
                elementi[i] = immagine;
                System.out.println("Livello di luminosità: " + luminosita);
                for (int j = 0; j < luminosita; j++) {
                    System.out.println("*");
                }
                System.out.println();
            } else if (scelta == 3) {
                System.out.println("Inserisci il titolo della registrazione audio:");
                String titolo = scanner.next();
                System.out.println("Nome Titolo: " + titolo);
                System.out.println("Inserisci la durata della registrazione audio:");
                int durata = scanner.nextInt();
                System.out.println("Durata: " + durata + " min");
                System.out.println("Inserisci il volume della registrazione audio:");
                int volume = scanner.nextInt();
                System.out.println("Volume: " + volume);
                RegistrazioneAudio registrazioneAudio = new RegistrazioneAudio(titolo, durata, volume);
                elementi[i] = registrazioneAudio;
            } else if (scelta == 4) {
                System.out.println("Elemento non trovato.");
            } else if (scelta == 5) {
                System.out.println("Elemento non trovato.");
            }
        }
    }

    public void esegui() {
        int scelta;
        do {
            System.out.println("Quale elemento eseguire?");
            scelta = scanner.nextInt();
            if (scelta >= 0 && scelta <= 3) {
                elementi[scelta].play();
            } else if (scelta == 4) {
                System.out.println("Elemento non trovato.");
            } else if (scelta == 5) {
                System.out.println("Elemento non trovato.");
            }
        } while (scelta >= 0 && scelta <= 3);
    }
}

