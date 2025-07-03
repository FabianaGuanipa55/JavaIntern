//9. Lista utenti attivi:
//· Classe Utente con username, attivo
//· Classe GestoreUtenti con lista di utenti e metodi:
//o stampaUtentiAttivi(): stampa solo gli utenti attivi
//o contaNonAttivi(): ritorna il numero di utenti non attivi
package utenti;

public class Utente {
    String username;
    boolean isAttivo;
    int tempoInattivo;
    public static final int TEMPO_MASSIMO_INATTIVO = 5; //5 MINUTI
    public Utente(String username, boolean isAttivo, int tempoInattivo){
        this.username= username;
        this.isAttivo= isAttivo;
        this.tempoInattivo = tempoInattivo;
    }
    public void controlloAttivi(){
        if(tempoInattivo >= TEMPO_MASSIMO_INATTIVO){
            isAttivo = false;
        }else{
            isAttivo = true;
        }
    }

}
