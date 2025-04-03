import java.util.*;
public class Array {
    public static void main(String[] args) {
        //1 Implementare un programma che conti quanti numeri pari sono presenti in un array di numeri interi, utilizzando un ciclo while.
/*        int [] pari={2,4,6,8,5,3,1};
        int conteggio=0;
        int i =0;
        while (i<pari.length){
            if(pari[i]%2==0) {
                conteggio++;
            }
            i++;
            }
        System.out.println("in questo array sono presenti " + conteggio + " numeri pari");

 */
        //2 Implementare un metodo che restituisca il valore massimo e il valore minimo in un array di numeri interi.
/*        int [] numeri= {99,50,34,1,98,6};
        int max=0;
        int min= Integer.MAX_VALUE;
        for(int i=0; i<numeri.length;i++){
            if(numeri[i]>max){
                max=numeri[i];
            }
            if(numeri[i]<min){
                min=numeri[i];
            }

        }
        System.out.println("il valore massimo è: " + max);
        System.out.println("il valore minimo è " + min);
*/
        //3 Implementare un metodo che calcoli la somma degli elementi in un array di numeri interi.
/*        int [] interi={1,2,3,4,5};
        int somma=0;
        for(int numero: interi){
            somma+=numero;
        }
        System.out.println("il totale della somma è di: " + somma);

 */

        //4 Implementa un metodo che dato un array e un numero, trovi tutte le combinazioni di coppie che sommate diano il numero specifico.
/*        int [] numeri={1,2,3,4,5,6,7,8,9,};
        int somma=7;
        combinazioni(numeri,somma);
        }
        public static void combinazioni(int [] numeri, int somma){
        for(int i=0;i<numeri.length;i++){
            for(int j=i+1;j<numeri.length;j++){
                if(numeri [i]+ numeri [j]==somma){
                    System.out.println(numeri[i] + "|" + numeri[j]);
                }
            }
        }
*/
//5 ruota gli elementi di un array a destra di una posizione. Ad esempio, se l'array è {1, 2, 3, 4}, diventa {4,1 ,2 ,3 }.
/*        int[] numeri = {1, 2, 3, 4};
        int ruota = 1;
        numeri = ruotaDestra(numeri, ruota);
        System.out.println(Arrays.toString(numeri));
    }

    public static int [] ruotaDestra(int[] numeri, int ruota) {
        for (int i = 0; i < ruota; i++) {
            int r = numeri[numeri.length - 1];
            for (int j = numeri.length - 1; j>0; j--) {
                numeri[j] = numeri[j - 1];
            }
            numeri[0] = r;
        }
        return numeri;
 */
        //6 Implementare un metodo che esegua una ricerca su un array di interi per trovare un valore specifico, il metodo deve ritornare la posizione dell’elemento trovato.
/*        int[] interi = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int valore = 9;
        int posizione=trovaValore(interi,valore);
        System.out.println("il valore " + valore + " è stato trovato alla posizione " + posizione);
    }
    public static int trovaValore(int[] interi, int valore){
        for(int i=0; i<interi.length;i++){
            if(interi[i]==valore){
                return i;
        }
    }
        return -1;

 */
        //7 Implementare un metodo che inverta gli elementi di un array (ad esempio, un array [1, 2, 3] diventa [3, 2, 1]).
/*       int [] numeri= {1,2,3};
        System.out.println("Array di numeri originale: "+ Arrays.toString(numeri));
        int [] inverti= invertito(numeri);
        System.out.println("Array invertito: " + Arrays.toString(inverti));
    }
    public static int [] invertito(int [] numeri){
        int [] inverti= new int [numeri.length];
        for(int i=0; i<numeri.length;i++){
            inverti[i]=numeri[numeri.length-1-i];
        }
        return inverti;
 */
        //8 Implementare un metodo che conti quante volte un elemento specifico appare in un array di numeri interi.
/*        int [] numeri={1,2,3,4,5,2,2,2,2,6,7,8,9};
        int cercaNumero=2;
        int conteggio=0;
        for(int numero:numeri){
            if(numero==cercaNumero){
                conteggio++;
            }
        }
        System.out.println("L'elemento: " + cercaNumero + " appare nell'array: " + conteggio + " volte");

 */
        //9 Implementare un metodo che ordini un array di numeri decimali in ordine crescente.
/*        double[] numeri = {3.4, 6.7, 1.2, 8.9, 2.3, 5.0};
        System.out.println("Array originale " + Arrays.toString(numeri));
        ordinaArray(numeri);
        System.out.println("Array ordinato " + Arrays.toString(numeri));
    }

    public static void ordinaArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    double temporanea = array[i];
                    array[i] = array[j];
                    array[j] = temporanea;
                }
            }
        }

 */
        //10 Implementare un metodo che rimuova un elemento specifico da un array di numeri. Dopo la rimozione, l'array dovrebbe ridurre la sua dimensione.
/*        int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        System.out.println("Array originale " + Arrays.toString(numeri));
        int numeroDarimuovere = 8;
        numeri = rimuoviNumero(numeri, numeroDarimuovere);
        System.out.println("Array nuovo " + Arrays.toString(numeri));
    }

    public static int[] rimuoviNumero(int[] array, int rimuovere) {
        int nuovaLunghezza = array.length - 1;
        int[] nuovoArray = new int[nuovaLunghezza];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != rimuovere) {
                if (j < nuovaLunghezza) {
                    nuovoArray[j] = array[i];
                    j++;
                }
            }
        }
        return nuovoArray;ù

 */
        //Implementare un metodo che verifichi se un array di numeri è palindromo
/*        int[] numeri = {1, 2, 3, 2, 1};
        System.out.println("L'array è palindromo: " + isPalindromo(numeri));
    }
        public static boolean isPalindromo(int[] numeri){
        int lunghezza= numeri.length;
        for(int i=0; i<lunghezza/2; i++){
            if(numeri[i] != numeri[lunghezza-1-i]){
                return false;
            }
        }
        return true;

 */
    }
}



