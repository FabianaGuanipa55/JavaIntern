//10. Simulazione lancio dadi
//· Classe Dado
//· Metodo simulaLanci(int nLanci) che:
//o lancia un dado per nLanci volte
//o conta quante volte esce 6
//o stampa il risultato di ogni lancio
package lancioDadi;

import java.util.Random;

public class Dado {
    public void simulaLanci(int nLanci) {
        Random random = new Random();
        int contaSei = 0;

        for (int i = 1; i <= nLanci; i++) {

            int lancio = random.nextInt(6) + 1;

            System.out.println("Lancio " + i + ": " + lancio);

            if (lancio == 6) {
                contaSei++;
            }
        }

        System.out.println("Il numero 6 è uscito " + contaSei + " volte.");
    }

}
