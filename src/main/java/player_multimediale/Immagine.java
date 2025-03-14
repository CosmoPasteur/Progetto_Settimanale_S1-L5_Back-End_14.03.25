package player_multimediale;

public class Immagine extends ElementoMultimediale {
    private int luminosita;
    public Immagine(String titolo,  int luminosita) {
        super(titolo, luminosita);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void show()  {
            System.out.print(getTitolo());
            for (int i = 0; i < getLuminosita(); i++) {
                System.out.print("*");
            }
    }
}
