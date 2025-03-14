package player_multimediale;

public class ElementoMultimediale {
    //elemento multimediale (immagine, video,registrazione audio) identificato da un titolo
    private String titolo;
    private int durata;
    private int volume;



    public ElementoMultimediale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String toString() {
        return "Titolo: " + titolo + ", Durata: " + durata + " secondi";
    }

    public void play() {
        System.out.println("Sto riproducendo " + titolo);
    }

}
