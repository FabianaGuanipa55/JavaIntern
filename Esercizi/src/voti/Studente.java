//Registro voti:
//· Classe Studente con nome e lista di voti
//· Metodo calcolaMedia() che calcola la media
//· Metodo stampaSituazione() che:
//o stampa "Promosso" se la media è maggiore o uguale a 6
//o stampa "Bocciato" altrimenti
//o stampa un avviso per ogni voto inferiore a 6 (usa un ciclo e if)
package voti;

public class Studente {
    String nome;
    int[] listaVoti;

    public Studente(String nome, int[] listaVoti) {
        this.nome = nome;
        this.listaVoti = listaVoti;
    }

    public int calcolaMedia() {
        int somma = 0;
        for (int i = 0; i < listaVoti.length; i++) {
            somma += listaVoti[i];
        }
        return (int) somma / listaVoti.length;
    }

    public void stampaSituazione() {
        int media = calcolaMedia();
        if (media >= 6) {
            System.out.println("Promosso");
        } else {
            System.out.println("Bocciato");
        }
        for (int voto : listaVoti) {
            if (voto < 6) {
                System.out.println("Il voto è inferiore a 6: " + voto);
            }
        }
    }
}
