package matrici;

public class ArrayBidimensionale {
    public static void main(String[] args) {
        //1 Data una matrice quadrata (NxN) di numeri interi, scrivi un programma Java che calcoli separatamente:
        //	la somma degli elementi di ogni riga
        //	la somma degli elementi di ogni colonna

        int[][] matrice = {
                {1, 1,1},
                {3, 3,3}
        };
        int riga = matrice.length;
        int colonna=matrice[0].length;
        for (int i = 0; i < riga; i++) {
            int sommaRiga = 0;
            for (int j = 0; j < colonna; j++) {
                sommaRiga += matrice[i][j];

            }
            System.out.println(""+ sommaRiga);
        }

        for(int j=0; j<colonna;j++){
            int sommaColonna=0;
            for(int i=0;i<riga;i++){
                sommaColonna += matrice [i] [j];

            }
            System.out.println("" + sommaColonna);
        }



        //2 Data una matrice di dimensioni MxN e un valore intero da cercare,
        // scrivi un programma Java che verifichi se il numero è presente nella matrice
        // e restituisca tutte le posizioni (righe e colonne) in cui appare.
    /*     int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 6, 6}
        };
        int valore = 6;
        trovaValore(matrice, valore);

    }

    public static void trovaValore(int[][] matrice, int valore) {
        int conteggio= 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) { //meglio da [i]
                if (matrice[i][j] == valore) {
                    conteggio++;
                    System.out.println("Il valore " + valore + " è stato trovato alla posizione " + i + " " + j);

                }
            }
        }
        if(conteggio<=0){
            System.out.println("il valore non è stato trovato");
        }
        System.out.println("il numero delle occorrenze: " + conteggio);ù

     */

    }
}



