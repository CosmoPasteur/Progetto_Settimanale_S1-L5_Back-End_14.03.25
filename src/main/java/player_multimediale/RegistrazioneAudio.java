package player_multimediale;

public class RegistrazioneAudio extends ElementoMultimediale {
        private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {

        super(titolo, durata);
        this.volume = volume;
    }

    public void abbassaVolume() {
        volume--;
    }

    public void alzaVolume() {
        volume++;
    }

    @Override
    public void play() {

        for (int i = 0; i < getDurata(); i++) {
            System.out.println(getTitolo());
            System.out.println("volume: " + volume);
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
        }
        }

    }

    //**************************


    //una registrazione audio è riproducibile e ha associato anche un volume (di tipo int con valore positivo) e i metodi abbassaVolume() e alzaVolume()








