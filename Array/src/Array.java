import java.util.Arrays;

//Stampa di un array
public class Array {
    public static void main(String[] args) {
        //Stampa di un array
    /*     int numeriInteri[] = new int[5];
        numeriInteri[0] = 10;
        numeriInteri[1] = 20;
        numeriInteri[2] = 30;
        numeriInteri[3] = 40;
        numeriInteri[4] = 50;

        for(int i = 0; i < numeriInteri.length; i++){
        System.out.println("Elemento Corrente: " + numeriInteri [i]);
        }
    */
        //Crea un array di numeri interi e calcola la somma di tutti i suoi elementi.
    /*    int interi []= new int [4];
        interi [0]= 3;
        interi [1]= 3;
        interi [2]= 3;
        interi [3]= 2;
        int somma= 0;
        for(int i=0; i<interi.length;i++) {
            somma += interi[i];
        }
        System.out.println("La somma di tutti gli elementi è: " + somma);

     */
        //Scrivi un programma che trovi il valore massimo
        //Scrivi un programma minimo in un array di numeri interi.
    /*    int [] valoreMax = {4,9,60};
        int max=0;
        for(int i=0; i<valoreMax.length;i++){
            if(valoreMax[i]>max){
                max=valoreMax[i];
            }
        }
        System.out.println("Il valore massimo è: " + max);

     */
    /*    int [] valoreMin = {80,2,90,75,11,23};
        int min= Integer.MAX_VALUE; //il valore max possibile, o errore :(
        for(int i=0; i<valoreMin.length;i++){
            if(valoreMin[i]<min){
                min=valoreMin[i];
            }
        }
        System.out.println("Il valore minimo è: " + min);

     */
        //Inverti un array Crea un array di interi e scrivi un programma per invertire l'ordine dei suoi elementi.
    /*    int[] array1 = new int [] {80, 2, 90, 75, 11, 23};
        System.out.println(Arrays.toString(array1)); //bisogna mettere il ArraysToString o mi stampa l'indirizzo di memoria dell'array
        int [] arrayInverso= arrayInvertito(array1);
        System.out.println(Arrays.toString(arrayInverso));
    }
    public static int [] arrayInvertito(int[] array1){
        int [] arrayInverso = new int [array1.length];
        for(int i=0; i<array1.length; i++ ){
            arrayInverso[i] =array1[array1.length-1-i];
        }
        return arrayInverso;
    }

     */
        //Conta gli elementi pari e dispari Scrivi un programma che conta quanti numeri pari e quanti dispari ci sono in un array.
    /*    int[] numeri = new int [] {80, 2, 90, 75, 11, 23};
        for(int numero:numeri){
            if(numero%2==0){
                System.out.println("pari: " + numero);
            }else{
                    System.out.println("dispari: " +numero);
            }
        }
*/

        //Implementa un programma che controlla se un determinato numero è presente in un array.
        /*int[] numeriNumeri = new int [] {80, 2, 90, 75, 11, 23};
        for(int i=0; i<numeriNumeri.length; i++){
            int NumeroCorrente= 75;
            if(NumeroCorrente==numeriNumeri [i]) {
            System.out.println("Il numero presente c'e:" + NumeroCorrente);
            }
        }

         */
        //mi è venuta in mente un altro modo:
    /*   int[] numeriNumeri = {80, 2, 90, 75, 11, 23};
        int NumeroCorrente= 75;
        boolean trovato= false;
        for(int i=0; i<numeriNumeri.length; i++) {
            if(NumeroCorrente==numeriNumeri [i]){
                trovato=true;
                break;
            }
        }
        if (trovato){
            System.out.println("Il numero c'è: " + NumeroCorrente);
        }else{
            System.out.println("Il numero non è nell'array: " + NumeroCorrente);
        }
    */
//Scrivi un programma che rimuove un elemento specifico da un array, creando un nuovo array senza quell'elemento.
    /*    int interi []= new int [4];
        interi [0]= 3;
        interi [1]= 3;
        interi [2]= 3;
        interi [3]= 2;
        System.out.println(Arrays.toString(interi));
        int rimuoviNumero= 2;
        for(int numero:interi){
            if(numero != rimuoviNumero){
                System.out.println("" + numero);
            }
        }
     */
        //Unisci due array Scrivi un programma che unisce due array di dimensione diversa in un unico array.
    /*    int[] interiUno = {80, 40, 90, 75, 88, 23};
        int[] interiDue = {1, 2, 3, 4};
        int[] nuovoArray = arrayInsieme(interiUno, interiDue);
        System.out.println(Arrays.toString(nuovoArray));
    }
    public static int[] arrayInsieme(int[] arrayUno, int[] arrayDue) {
        int primo = arrayUno.length;
        int secondo = arrayDue.length;
        int[] nuovoArray = new int[primo + secondo];

        int unisci = 0;
        for (int numero : arrayUno) {
            nuovoArray[unisci] = numero;
            unisci++;
        }
        for (int numero : arrayDue) {
            nuovoArray[unisci] = numero;
            unisci++;
        }
        return nuovoArray;
    }

     */
    /*    //Scrivi un programma che trovi gli elementi duplicati in un array di numeri interi.
        int [] duplicati= {2,4,8,6,7,4,2};
        for(int i=0; i<duplicati.length; i++){
            for (int x=0; x<duplicati.length; x++){
                if(duplicati[i]==duplicati[x]){
                    System.out.println("c'è un duplicato: " + duplicati [i] + duplicati [x]);
                }
            }
        }

     */
        //Rotazione a sinistra Implementa un programma che ruota gli elementi di un array a sinistra di una posizione. Ad esempio, se l'array è {1, 2, 3, 4}, diventa {2, 3, 4, 1}.
    /*    int[] numeri = {1, 2, 3, 4};
        int ruota = 1;
        numeri = ruotaSinistra(numeri, ruota);
        System.out.println(Arrays.toString(numeri));
    }
        public static int [] ruotaSinistra(int [] numeri, int ruota){
            for(int i=0; i<ruota;i++){
                int r= numeri[0];
                for(int x= 0; x<numeri.length -1; x++){
                    numeri[x]=numeri [x+1];
                }
                numeri[numeri.length-1]=r;
            }
            return numeri;
        }
        public static void stampo(int [] numeri){
            System.out.println(Arrays.toString(numeri));

     */
        //Trova coppie con una somma specifica Dato un array e un numero, trova tutte le coppie di elementi il cui valore sommato corrisponde al numero dato.
        int[] coppieNumeri = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        int somma = 10;
        trovaCoppie(coppieNumeri, somma);
    }

    public static void trovaCoppie(int[] coppieNumeri, int somma) {
        for (int i = 0; i < coppieNumeri.length; i++) {
            for (int x = i + 1; x < coppieNumeri.length; x++) {
                if(coppieNumeri[i] + coppieNumeri[x] == somma){
                    System.out.println(coppieNumeri[i] + "," + coppieNumeri [x]);
                }
            }
        }
    }
}



//Array ordinato Scrivi un programma che ordina un array in ordine crescente usando un algoritmo di ordinamento come Bubble Sort o Selection Sort.
//Merge di due array ordinati Scrivi un programma per unire due array ordinati in uno nuovo che sia anch'esso ordinato.
