package voti;

public class Main {
    public static void main(String[] args) {
        int [] votiStudente1 = {7,7,7,6};
        int [] votiStudente2 = {3,3,2,1};
        Studente studente1 = new Studente("Gennaro", votiStudente1);
        Studente studente2 = new Studente("Mario", votiStudente2);
        studente1.calcolaMedia();
        studente1.stampaSituazione();
        studente2.calcolaMedia();
        studente2.stampaSituazione();

    }
}
