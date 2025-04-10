package cicli;

import java.util.Scanner;

public class Cicli {
    public static void main(String [] args){
        //1 Implementare un metodo che calcoli il fattoriale di un numero intero utilizzando un ciclo for.
/*       int numero =3;
        int fattoriale=1;

        for(int i=1; i<= numero; i++){
            fattoriale*=i;
        }
        System.out.println("Il fattoriale di " + numero + " = " + fattoriale );

 */
        //2 Implementare un metodo che verifichi se un numero intero è un numero primo utilizzando un ciclo for.
/*      int intero=1;
        int verifica=1;
        for(int i=1; i<intero; i++){
            if(intero%i==0){
                System.out.println("la variabile intero" + intero);
            }

        }

 */
/*        //4 Implementare un metodo che inverta una stringa fornita utilizzando un ciclo for.
        String stringa = "Ciao";
        stringa = invertiStringa(stringa);
        System.out.println(stringa);
    }

    public static String invertiStringa(String stringa) {
        String stringaInvertita = "";
        for (int i = stringa.length() - 1; i >= 0; i--) {
            stringaInvertita += stringa.charAt(i);
        }
        return stringaInvertita;

 */
        //3 Implementare un metodo che conti il numero di vocali in una stringa fornita utilizzando un ciclo for.
/*        String stringa= "Ciao a tutti";
        int conta= contaVocali(stringa);
    }
    public static int contaVocali(String stringa){
        int conteggio=0;
        String vocali= "aeiou";
        for(char carattere:stringa.charAt()){
            if(vocali.contains(stringa)){
                conteggio++;
            }
        }
        return conteggio;

 */
        //5 Implementare un metodo che calcoli la somma dei numeri interi da 1 a N utilizzando un ciclo while.
/*        int numero=4;
        int risultato=calcolaSomma(numero);
        System.out.println("il risultato è: "+ risultato);
    }
        public static int calcolaSomma(int n){
        int somma=0;
        int i=1;
        while(i<=n){
            somma+=i;
            i++;
            }
        return somma;

 */
        //6 Implementare un metodo che calcoli la potenza di un numero (a^b) utilizzando un ciclo while, dove a è la base e b è l'esponente.
/*        int base=2;
        int esponente=3;
        int risultato=calcolo(base,esponente);
        System.out.println("il risultato è: "+ base + esponente + risultato);
    }
         public static int calcolo(int a, int b){
        int risultato=1;
        int i=1;
        while(i<b){
            risultato*=a;
        }
        return risultato;

 */
        //7 Implementare un programma che scelga casualmente un numero tra 1 e 100 e chieda all'utente di indovinarlo.
        // Il programma deve continuare a chiedere finché l'utente non indovina il numero.
        int numeroCasuale= 7;
        int scelta;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("scegli un numero da 1 a 100...cerca di indovinare il numero fortunato");
            scelta= scanner.nextInt();
            if(scelta != numeroCasuale){
            }
        }while(scelta != numeroCasuale);
        System.out.println("hai indovinato!!!");
    }
}


