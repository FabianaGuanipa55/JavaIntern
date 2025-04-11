package ordini;

public class Main {
    public static void main(String [] args){
        try {
            Elettronico IPad = new Elettronico(1, 12345, "IPad Air", 799.99);
            Elettronico tv = new Elettronico(3, 3456, "LG Oled ", 950.99);
            Abbigliamento felpa = new Abbigliamento(9876, "felpa con cappuccio", 34.99, "Small");
            Abbigliamento cardigan = new Abbigliamento(4567, "cardigan in lana con bottoni", 199.99, "Large");

            Ordine primoOrdine = new Ordine();
            primoOrdine.aggiungiProdotto(tv);
            primoOrdine.aggiungiProdotto(IPad);

            Ordine secondoOrdine = new Ordine();
            secondoOrdine.aggiungiProdotto(felpa);
            secondoOrdine.aggiungiProdotto(cardigan);

            GestioneOrdini gestione = new GestioneOrdini();
            gestione.creaOrdine(1, primoOrdine);
            gestione.creaOrdine(2, secondoOrdine);

            System.out.println("Processo il primo ordine");
            gestione.processaOrdine(primoOrdine);

            System.out.println("Processo il secondo ordine");
            gestione.processaOrdine(secondoOrdine);

        }catch (ProdottoEsauritoException e){
            System.out.println("Errore durante la gestione dell'ordine: " + e.getMessage());
        }


    }
}
