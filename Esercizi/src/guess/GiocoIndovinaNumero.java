//8. Gioco indovina numero Crea una classe GiocoIndovinaNumero con:
//· Numero segreto casuale tra 1 e 100
//· Metodo gioca() che:
//o riceve un numero in input e indica se è troppo alto o basso fino a che l'utente indovina
//o conta il numero di tentativi (usa un ciclo)
package guess;

import java.util.Scanner;

public class GiocoIndovinaNumero {
    public static final int NUMERO = 77;

    public void gioca() {
        Scanner scanner = new Scanner(System.in);
        int tentativiMassimi = 3;
        boolean indovinato = false;
        System.out.println("Indovina il numero");
        System.out.println("Devi indovinare un numero da 1 a 100");
        System.out.println("Hai massimo " + tentativiMassimi + " tentativi");
        for (int tentativo = 1; tentativo <= tentativiMassimi; tentativo++) {
            System.out.print("Tentativo " + tentativo + ": inserisci un numero da 1 a 100: ");

            int numeroUtente;
            if (scanner.hasNextInt()) {
                numeroUtente = scanner.nextInt();
            } else {
            System.out.println("Inserisci un numero intero");
            scanner.next();
            tentativo--;
            continue;
        }
            if (numeroUtente < 1 || numeroUtente > 100) {
                System.out.println("Numero fuori dal range 1-100. Riprova");
                tentativo--; // non contare questo tentativo
                continue;
            }

            if (numeroUtente == NUMERO) {
                System.out.println("Hai indovinato il numero !!!!");
                indovinato = true;
                break;
            } else if (numeroUtente < NUMERO){
                System.out.println("Numero troppo basso");
            } else {
                System.out.println("Numero troppo alto");
            }
        }

        if (!indovinato) {
            System.out.println("Hai perso: Il numero era: " + NUMERO);
        }

        scanner.close();
    }

}

