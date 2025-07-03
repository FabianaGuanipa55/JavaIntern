package utenti;

public class Main {
    public static void main(String[] args) {
        GestoreUtenti gestore = new GestoreUtenti();

        // Creo utenti con username, stato iniziale e tempo inattivo (minuti)
        Utente u1 = new Utente("Mario", true, 3);
        Utente u2 = new Utente("Gennaro", true, 6);
        Utente u3 = new Utente("Nicola", true, 1);
        Utente u4 = new Utente("Anna", true, 5);

        gestore.aggiungiUtente(u1);
        gestore.aggiungiUtente(u2);
        gestore.aggiungiUtente(u3);
        gestore.aggiungiUtente(u4);

        gestore.stampaUtentiAttivi();

        int nonAttivi = gestore.contaNonAttivi();
        System.out.println("Numero utenti non attivi: " + nonAttivi);
        gestore.stampaUtentiNonAttivi();
    }
}