package biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;


public class Biblioteca {
    private ArrayList<ElementoBiblioteca> catalogo;
    private HashMap<ElementoBiblioteca, Membro> prestiti;
    private HashMap<ElementoBiblioteca, LinkedList<Membro>> listeAttessa;

    public Biblioteca() {
        this.catalogo = new ArrayList<>();
        this.prestiti = new HashMap<>();
        this.listeAttessa = new HashMap<>();
    }

    public ArrayList<ElementoBiblioteca> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<ElementoBiblioteca> catalogo) {
        this.catalogo = catalogo;
    }

    public void aggiungiArticoli(ElementoBiblioteca elemento) {
        this.catalogo.add(elemento);
    }

    public void prestaElemento(ElementoBiblioteca elemento, Membro membro) throws LimitePrestitiRaggiuntoException, ElementoNonDisponibileException {
        if (membro.getPrestitoCorrente() >= 3) {
            throw new LimitePrestitiRaggiuntoException(membro.getNome() + " Hai già tre articoli, non ne puoi prenderne altri");
        }
        if (prestiti.containsKey(elemento)) {
            listeAttessa.putIfAbsent(elemento, new LinkedList<>());
            listeAttessa.get(elemento).add(membro);
            System.out.println(membro.getNome() + " Sei nella lista d'attessa per " + elemento.getTitolo());

            throw new ElementoNonDisponibileException(" L'articolo " + elemento.getTitolo() + " non è disponibile");
        }
        prestiti.put(elemento,membro);
        membro.incrementaPrestito();
        System.out.println("---Prestiti---");
        System.out.println(membro.getNome() + " Ha preso in prestito " + elemento.getTitolo());
    }

    public void restituisciElemento(ElementoBiblioteca elemento) throws ElementoNonDisponibileException {

        if (prestiti.containsKey(elemento)) {
            Membro membro = prestiti.remove(elemento);
            membro.decrementaPrestito();
            System.out.println("L'elemento " + elemento.getTitolo() + " è stato restituito da: " + membro.getNome());
            if (listeAttessa.containsKey(elemento) && !listeAttessa.get(elemento).isEmpty()) {
                Membro nextMembro = listeAttessa.get(elemento).poll();
                try {
                    prestaElemento(elemento, nextMembro);
                    System.out.println("L'articolo è stato prestato " + elemento.getTitolo());
                } catch (ElementoNonDisponibileException | LimitePrestitiRaggiuntoException e) {
                    System.out.println("----C'è stato un errore durante il prestito " + e.getMessage());
                    listeAttessa.get(elemento).addFirst(nextMembro);
                }
            }
        }
    }
    public HashSet<String> ottieniAutoriUnici(){
        HashSet<String>autoriUnici=new HashSet<>();
        for(ElementoBiblioteca elemento: catalogo){
            autoriUnici.add(elemento.getAutore());
        }
        return autoriUnici;
    }
    public void stampoCatalogo(){
        System.out.println("-------------------------Catalogo Biblioteca----------------------------");
        for (ElementoBiblioteca elemento: catalogo){
            System.out.println(elemento);
        }
    }

    public void stampaListaAttessa(){
        System.out.println("----------------Lista Attessa Biblioteca---------------");
        for(ElementoBiblioteca e: listeAttessa.keySet()){
            System.out.println("Larticolo " + e.getTitolo());
            for(Membro m: listeAttessa.get(e)){
                System.out.println(m.getNome() + "");
            }
            System.out.println();
        }
    }
}
