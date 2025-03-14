package player_multimediale;

public class Video extends ElementoMultimediale {
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public int getVolume() {
        return volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void aumentaVolume() {
        volume++;
    }

    public void diminuisciVolume() {
        volume--;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    @Override
    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            System.out.print(getTitolo());
            for (int j = 0; j < getVolume(); j++) {
                System.out.print("!");
            }
            for (int j = 0; j < getLuminosita(); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Sto riproducendo " + getTitolo() + " a volume " + volume + " e luminosita " + luminosita);
    }
}
