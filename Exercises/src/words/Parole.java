//Creare un’applicazione che consenta di fruire delle funzionalità di un’entità “Parole”.
//L’entità “Parole” è costituita da una lista di 5 parole e permette di eseguire le seguenti operazioni:
//– Metodo inserisciParole: Permette l’inserimento delle 5 parole nella lista tramite input utente.
//– Metodo ordinaParole: Permette di ordinare le 5 parole in ordine alfabetico.
//– Metodo concatenaParole: Permette di creare una parola unica formata dalla concatenazione di tutte le parole inserite.
//– Metodo contaCaratteri: Permette di contare il numero di caratteri totali di tutte le parole (somma dei caratteri di tutte le parole).
//L’utente può scegliere tramite input quale operazione eseguire.
//L’applicazione, una volta avviata, rimane in esecuzione finché l’utente non decide di terminarla.
//Hint:
//•	L’utente non può eseguire i metodi successivi se non ha inserito le parole.
//•	L’utente può eseguire solo le operazioni previste dalla classe parole, nel caso scelga di effettuare un’operazione non prevista informare l’utente che deve scegliere una delle opzioni proposte.
package words;
import java.util.*;

public class Parole {
    List <String> parole;
    public Parole(){
        this.parole= new ArrayList<>();
    }
    public void inserisciParole(){
        Scanner scanner= new Scanner (System.in);
        System.out.println("Inserisci 5 parole: ");
        String parola = scanner.nextLine();
        for(int i=0; i<5; i++){
            parole.add(parola);
        }
    }
    public void ordinaParole(){
        Collections.sort(parole);
        System.out.println("parola ordinata: " + parole);
    }
    public void concatenaParole(){
        String concatena= "";
        for(String parola: parole){
            concatena += parola;
        }
        System.out.println("parola concatenata: " + concatena);
    }
    public void contaCaratteri(){
        int caratteri=0;
        for(String parola: parole){
            caratteri += parola.length();
        }
        System.out.println("il numero totale dei caratteri è di: " + caratteri);
    }
    public boolean sonoPresentiParole(){
        return !parole.isEmpty();
    }
}
