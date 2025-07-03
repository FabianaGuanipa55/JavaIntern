//7. Ordina array decrescente senza sort
//· Classe Ordinatore con metodo:
//o ordinaDecrescente(int[] array): ordina un array in modo decrescente usando un algoritmo tipo bubble sort (ciclo + condizioni)
package array;

public class Ordinatore {
    public void ordinaDecrescente(int[] array) {
        int n = array.length;
        int temp;
        boolean scambiato;

        for (int i = 0; i < n - 1; i++) {
            scambiato = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    scambiato = true;
                }
            }
            if (!scambiato) {
                break;
            }
        }
    }
    public void stampaArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    }
