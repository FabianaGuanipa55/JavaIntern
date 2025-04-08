package matrici;

public class ArrayBidimensionale {
    public static void main(String[] args) {
        //1 Data una matrice quadrata (NxN) di numeri interi, scrivi un programma Java che calcoli separatamente:
        //	la somma degli elementi di ogni riga
        //	la somma degli elementi di ogni colonna
    /*    int[][] matrice = {{1, 2},
                            {3, 4}};
        int x = matrice.length;
        int sommaRiga = 0;
        int sommaColonna=0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; i < matrice.length; j++) {
                sommaRiga += matrice[i][j];

            }
            System.out.println(sommaRiga);
        }
        for(int j=0; j<matrice.length;j++){

            for(int i=0;i<matrice.length;i++){
                sommaColonna += matrice [i] [j];

            }
            System.out.println(sommaColonna);
        }

     */
        //2 Data una matrice di dimensioni MxN e un valore intero da cercare,
        // scrivi un programma Java che verifichi se il numero è presente nella matrice
        // e restituisca tutte le posizioni (righe e colonne) in cui appare.
        int [] [] matrice= {{1,2,3,
                            4,5,6,
                            7,8,9}};
        int valore =6;
        int poszione [] [] =trovaValore(matrice, valore);//provided=[][]
        System.out.println("Il valore " + valore + "è stato trovato alla posizione" + poszione);

    }
    public static int [] [] trovaValore(int [] [] matrice, int valore) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                if (matrice[i][j] == valore) {
                    System.out.println("" + i + j);
                }
            }
        }
        return;
    }
}



