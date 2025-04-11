package ordini;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Ordine {
    private List<Prodotto> listaProdotti;
    private LinkedList<String> fasiSpedizione;
    private HashSet<String> categorieProdotti;
    public Ordine(){
        this.listaProdotti= new ArrayList<>();
        this.fasiSpedizione=new LinkedList<>();
        this.categorieProdotti=new HashSet<>();
    }
    public void aggiungiProdotto(Prodotto prodotto){
    this.listaProdotti.add(prodotto);
    }
    public void aggiungiFaseSpedizione(String fase){
    this.fasiSpedizione.offer(fase);
    }

    public List<Prodotto> getListaProdotti() {

        return listaProdotti;
    }

    public LinkedList<String> getFasiSpedizione() {
        return fasiSpedizione;
    }

    public HashSet<String> getCategorieProdotti() {

        return categorieProdotti;
    }
}
