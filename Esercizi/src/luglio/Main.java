package luglio;
public class Main {
    public static void main(String[] args) {
        Magazzino magazzino = new Magazzino();
        magazzino.aggiungiProdotto(new Prodotto("Cuffie", 2 ));
        magazzino.aggiungiProdotto(new Prodotto("Mouse", 2 ));
        magazzino.aggiungiProdotto(new Prodotto("tastiera", 7));

        System.out.println("Scorte basse (soglia 6):" );
        magazzino.verificaScorteBasse(6);

        System.out.println("Aggiungo delle cuffie alla scorta");
        magazzino.aggiungiScorta("Cuffie", 2);

        System.out.println("Scorte basse (soglia 6) dopo aggiornamento:");
        magazzino.verificaScorteBasse(6);

    }
}
