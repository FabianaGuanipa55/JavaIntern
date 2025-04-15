package ordini;

import java.util.HashMap;

public class GestioneOrdini {
   private HashMap<Integer, Ordine> gestioneOrdini;
   public GestioneOrdini(){
       this.gestioneOrdini=new HashMap<>();
   }
   public void creaOrdine(int id, Ordine ordine){
    gestioneOrdini.put(id, ordine);
   }
   public Ordine ottieniOrdine(int ordineId){
    return this.gestioneOrdini.get(ordineId);
   }
   public void processaOrdine(Ordine ordine) throws ProdottoEsauritoException{
       System.out.println("-----------Inizio elaborazione ordine------------");

       for(Prodotto prodotto: ordine.getListaProdotti()){
           if(prodotto.getPrezzo()==0){
               throw new ProdottoEsauritoException("Il prodotto: " + prodotto.getNome() + "non è al momento disponibile. ");
           }
           System.out.println("Prodotto" + prodotto.getNome() + " è disponibile. ");
       }
       ordine.aggiungiFaseSpedizione("Il tuo ordine è stato Confermato");
       ordine.aggiungiFaseSpedizione("Ci siamo quasi");
       ordine.aggiungiFaseSpedizione("Ordine spedito");
       System.out.println("-----------------Ordine elaborato correttamente---------------");

   }
}
