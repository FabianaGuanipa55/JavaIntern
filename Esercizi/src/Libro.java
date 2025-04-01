public class Libro {
    private String titolo;
    private String autore;
    private double prezzo;

    //costruttore
    public Libro(String titolo, String autore, double prezzo) {
    this.titolo= titolo;
    this.autore = autore;
    this.prezzo = prezzo;
    }
    //ho generato i getter e setter
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    //metodo per stampare i dettagli
    public void stampaDettagli(){
        System.out.println("Titolo del libro: " + titolo + "|" + "Autore del libro: " + autore + "|" + "Prezzo del libro: " + prezzo + " Monopoly");
    }
    //main per testare tutto
public static void main (String [] args){
        //oggetto/istanza libro
        Libro libro= new Libro("Il libro maledetto", "Giuseppe Verdi", 56);
        //metodo stampaDettagli
    libro.stampaDettagli();
}
}