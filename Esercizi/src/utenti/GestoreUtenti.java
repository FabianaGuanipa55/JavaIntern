package utenti;

import java.util.ArrayList;
import java.util.List;

public class GestoreUtenti {
    List<Utente> listaUtenti = new ArrayList<>();

    public void aggiungiUtente(Utente utente) {
        listaUtenti.add(utente);
    }

    public void stampaUtentiAttivi() {
        System.out.println("Utenti attivi:");
        for (Utente u : listaUtenti) {
            u.controlloAttivi();
            if (u.isAttivo) {
                System.out.println(u.username);
            }
        }
    }

    public int contaNonAttivi() {
        int count = 0;
        for (Utente u : listaUtenti) {
            u.controlloAttivi();
            if (!u.isAttivo) {
                count++;
            }
        }
        return count;
    }
    public void stampaUtentiNonAttivi() {
        System.out.println("Utenti non attivi:");
        for (Utente u : listaUtenti) {
            u.controlloAttivi(); // aggiorna lo stato
            if (!u.isAttivo) {
                System.out.println(u.username);
            }
        }
    }
}
