//Statistiche lista numeri Crea una classe StatisticheNumeri con metodo:
//· calcolaStatistiche(List<Integer> numeri) che:
//o stampa il minimo, massimo, media
//o conta quanti numeri sono pari e quanti dispari
//o conta quanti numeri sono maggiori di 50
package math;

import java.util.List;
import java.util.logging.Logger;

public class Statistica {
    private static final Logger logger = Logger.getLogger(Statistica.class.getName());
    public void calcolaStatistiche(List<Integer> numeri){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int somma = 0;
        int countPari = 0;
        int countDispari = 0;
        int countMaggiore50 = 0;
        for (int i = 0; i < numeri.size(); i++) {
            int numero = numeri.get(i);

            // minimo
            if (numero < min) {
                min = numero;
            }

            // massimo
            if (numero > max) {
                max = numero;
            }

            // somma per la media
            somma += numero;

            // conto pari e dispari
            if (numero % 2 == 0) {
                countPari++;
            } else {
                countDispari++;
            }

            // numeri maggiori di 50
            if (numero > 50) {
                countMaggiore50++;
            }
        }
        double media = (double) somma / numeri.size();
        logger.info("Minimo: " + min);
        logger.info("Massimo: " + max);
        logger.info("Media: " + media);
        logger.info("Numeri pari: " + countPari);
        logger.info("Numeri dispari: " + countDispari);
        logger.info("Numeri maggiori di 50: " + countMaggiore50);

    }
}
