package luglio;

import java.util.ArrayList;
import java.util.List;

public class Magazzino {
    List<Prodotto> prodotti;

    public Magazzino() {
        prodotti = new ArrayList<>();

    }

    public void aggiungiProdotto(Prodotto p) {
        prodotti.add(p);
    }

    public void verificaScorteBasse(int soglia) {
        for (Prodotto p : prodotti) {
            if (p.scorta < soglia) {
                System.out.println("Prodotto: " + p.nome + "Scorta: " + p.scorta);
            }

        }
    }

    public void aggiungiScorta(String nomeProdotto, int qta) {
        for (Prodotto p : prodotti) {
            if (p.nome.equals(nomeProdotto)) {
                p.scorta += qta;
                return;
            }
        }
    }
}
