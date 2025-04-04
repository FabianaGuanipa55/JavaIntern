package product;

public class Libro extends Prodotto {
    private String titolo;
    private String autore;
    private double prezzo;
    private int quatita;
    public Libro(String titolo, String autore, double prezzo, int quantita){
        this.titolo=titolo;
        this.autore=autore;
        this.prezzo=prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuatita() {
        return quatita;
    }

    public void setQuatita(int quatita) {
        this.quatita = quatita;
    }

    @Override
    public double CalcolaPrezzo() {
        return prezzo;
    }
}
