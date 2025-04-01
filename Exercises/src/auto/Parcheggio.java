package auto;

public class Parcheggio {
    private Veicolo[] postiParcheggio;
    private int numPosti;
    private int numVetture;
    private short oraCorrente;

    public Parcheggio(int numPosti) {
        this.postiParcheggio = new Veicolo[numPosti];
        this.numPosti = numPosti;
        this.numVetture = 0;
        this.oraCorrente = 0;
    }

    public boolean entraVettura(Veicolo veicolo) {
        if (numVetture < numPosti) {
            postiParcheggio[numVetture] = veicolo;
            numVetture++;
            return true;
        }
        return false;
    }

    public boolean esceVettura(int targa) {
        for (int i = 0; i < numVetture; i++) {
            if (postiParcheggio[i] != null && postiParcheggio[i].getTarga() == targa) {
                postiParcheggio[i] = null;
                return true;
            }
        }
        return false;
    }

    public void aggiornaOra() {
        oraCorrente = (short) ((oraCorrente + 1) % 24);
        rimuoviVettureScadute();
    }

    public void rimuoviVettureScadute() {
        for (int i = 0; i < numVetture; i++) {
            if (postiParcheggio[i] != null && postiParcheggio[i].getOraScadenza() <= oraCorrente) {
                postiParcheggio[i] = null;
            }
        }
    }

    public void promozione(int codicePromozione, int oreGratuite) {
        for (int i = 0; i < numVetture; i++) {
            if (postiParcheggio[i] != null && postiParcheggio[i].getTarga() % 100 == codicePromozione) {
                postiParcheggio[i].setOraScadenza((short) (postiParcheggio[i].getOraScadenza() + oreGratuite));
            }
        }
    }

    public void statisticaVetture() {
        int maxOreParcheggio = 0;
        for (int i = 0; i < numVetture; i++) {
            if (postiParcheggio[i] != null) {
                int oreParcheggio = postiParcheggio[i].getOraScadenza() - postiParcheggio[i].getOraArrivo();
                if (oreParcheggio > maxOreParcheggio) {
                    maxOreParcheggio = oreParcheggio;
                }
            }
        }

        System.out.println("Vetture con il massimo numero di ore " + maxOreParcheggio);
        for (int i = 0; i < numVetture; i++) {
            if (postiParcheggio[i] != null && (postiParcheggio[i].getOraScadenza() - postiParcheggio[i].getOraArrivo()) == maxOreParcheggio) {
                System.out.println(postiParcheggio[i]);
            }
        }
    }

    public short getOraCorrente() {
        return oraCorrente;
    }
}