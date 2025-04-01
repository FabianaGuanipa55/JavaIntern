package auto;

public class Main {
    public static void main(String[] args) {
        Parcheggio parcheggio = new Parcheggio(20);

        Veicolo veicolo1 = new Veicolo(123456, (short) 8, (short) 12);
        Veicolo veicolo2 = new Veicolo(678912, (short) 9, (short) 15);
        Veicolo veicolo3 = new Veicolo(122234, (short) 10, (short) 14);
        Veicolo veicolo4 = new Veicolo(987654, (short) 11, (short) 18);

        parcheggio.entraVettura(veicolo1);
        parcheggio.entraVettura(veicolo2);
        parcheggio.entraVettura(veicolo3);
        parcheggio.entraVettura(veicolo4);

        System.out.println("Ora corrente: " + parcheggio.getOraCorrente());

        parcheggio.aggiornaOra();
        System.out.println("Ora corrente: " + parcheggio.getOraCorrente());

        parcheggio.promozione(56, 2); // Esempio di promozione

        parcheggio.statisticaVetture();
    }
}