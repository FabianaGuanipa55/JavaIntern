package ordini;

public class Prodotto {
    private int id;
    private String nome;
    private double prezzo;
    public Prodotto(int id, String nome, double prezzo){
        this.id=id;
        this.nome=nome;
        this.prezzo=prezzo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Prodotto: " + "ID: " + id + ", Nome: " + nome + ", Prezzo: " + prezzo;
    }
}
