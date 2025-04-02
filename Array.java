//8 Implementare un metodo che conti quante volte un elemento specifico appare in un array di numeri interi.
//9 Implementare un metodo che ordini un array di numeri decimali in ordine crescente.
//10 Implementare un metodo che rimuova un elemento specifico da un array di numeri. Dopo la rimozione, l'array dovrebbe ridurre la sua dimensione.
//Implementare un metodo che verifichi se un array di numeri è palindromo (cioè, se è uguale a se stesso se letto da destra a sinistra). (questo vedilo bene che spesso viene chiesto)
//Implementare un metodo che rimuova i duplicati da un array, lasciando solo i valori unici.
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
       int [] numeri= {1,2,3};
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


    }
}

