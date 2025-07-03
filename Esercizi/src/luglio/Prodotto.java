//1.Gestione magazzino con scorte:
//· Classe Prodotto con nome, scorta
//· Classe Magazzino con una lista di prodotti e metodi:
//o verificaScorteBasse(int soglia): stampa i prodotti con scorta inferiore alla soglia usando un ciclo e if
//o aggiungiScorta(String nomeProdotto, int qta): incrementa la scorta del prodotto indicato
package luglio;

public class Prodotto {
    String nome;
    int scorta;
    public Prodotto(String nome, int scorta) {
        this.nome= nome;
        this.scorta= scorta;
    }


}
