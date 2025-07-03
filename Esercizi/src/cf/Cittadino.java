//Valida codice fiscale:
//· Classe Cittadino con nome, cognome, codiceFiscale
//· Metodo validaCodiceFiscale() che:
//o verifica che la lunghezza sia 16
//o controlla che i primi 6 caratteri siano lettere
//o conta almeno 2 numeri presenti nel codice (usa un ciclo)

package cf;

public class Cittadino {
    String nome;
    String cognome;
    String codiceFiscale;
    public Cittadino(String nome, String cognome, String codiceFiscale){
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }
    public void validaCodiceFiscale(){
        //verifico che la lunghezza sia di 16
    int lunghezzaTotale = codiceFiscale.length();
    if(lunghezzaTotale != 16){
        System.out.println("Codice fiscale non valido: il codice fiscale deve essere lungo 16 caratteri");
    }
    //verif che i primi 6 caratteri sono lettere
        String lettere = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean primiSeiLettere = true;
        for (int i = 0; i < 6; i++) {
            char c = codiceFiscale.charAt(i);
            boolean trovato = false;
            for (int j = 0; j < lettere.length(); j++) {
                if (c == lettere.charAt(j)) {
                    trovato = true;
                    break;
                }
            }
            if (!trovato) {
                primiSeiLettere = false;
                break;
            }
        }
        if (!primiSeiLettere) {
            System.out.println("Codice fiscale non valido: i primi 6 caratteri devono essere lettere");
            return;
        }

        // conto almeno 2 numeri nel cf
        String numeri = "0123456789";
        int contaNumeri = 0;
        for (int i = 0; i < codiceFiscale.length(); i++) {
            char c = codiceFiscale.charAt(i);
            for (int j = 0; j < numeri.length(); j++) {
                if (c == numeri.charAt(j)) {
                    contaNumeri++;
                    break;
                }
            }
        }
        if (contaNumeri < 2) {
            System.out.println("Codice fiscale non valido: deve contenere almeno 2 numeri");
            return;
        }

        System.out.println("Codice fiscale valido: " + codiceFiscale);
    }
}
