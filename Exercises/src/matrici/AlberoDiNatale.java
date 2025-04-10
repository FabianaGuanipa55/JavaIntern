package matrici;

public class AlberoDiNatale {
    public static void main(String[] args) {

       int numeroDiRighe=5;
       int numeroDiColonne=10;
       for(int i=0;i<numeroDiRighe;i++){
           for(int j=0; j<numeroDiColonne;j++) {
               if (i == 0) {
                   if (j == 3) {
                       System.out.print('*');
                   } else {
                       System.out.print(' ');
                   }
               }
               else{
                   if(j>=3-i && j<=3+i){
                       System.out.print('*');
                   }else{
                       System.out.print(' ');
                   }
               }
           }
        System.out.println();
       }
    }
}
//Crea un programma Java che, data un'altezza intera N fornita in input, disegni un albero di Natale utilizzando una matrice daratteri (char[][]).
//L'albero di Natale deve essere costituito dai seguenti elementi:
//•	Carattere '*' per rappresentare i rami e il tronco dell'albero.
//•	Carattere ' ' (spazio) per rappresentare le parti vuote.
//La matrice finale deve rappresentare graficamente un albero di Natale centrato, che abbia:
//•	I rami triangolari.
//•	Un tronco con altezza pari a 1/4 circa dell'albero (almeno 1).
//Esempio:
//Input:
//int N = 5;
//Esempio output: (stampando la matrice):
//    *
//   ***
//  *****
// *******
//*********
//    *
//Suggerimenti:
//•	Usa cicli annidati per riempire e stampare la matrice.
//•	Presta attenzione all'individuazione della posizione centrale per l'allineamento.