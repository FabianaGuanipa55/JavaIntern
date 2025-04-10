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

    public void articoli(ElementoBiblioteca elemento) {
        this.catalogo.add(elemento);
    }

    public void prestaElemento(ElementoBiblioteca elemento, Membro membro) throws LimitePrestitiRaggiuntoException, ElementoNonDisponibileException {
        if (catalogo.contains(elemento) && membro.getPrestitoCorrente() >= 3) {
            throw new LimitePrestitiRaggiuntoException(membro.getNome() + "Hai gia tre articoli, non ne puoi prendere altri");
        }
        if (prestiti.containsKey(elemento)) {
            throw new ElementoNonDisponibileException("L'articolo " + elemento.getTitolo() + " non è disponibile");
        }
    }

    public void restituisciElemento(ElementoBiblioteca elemento) throws ElementoNonDisponibileException {

        if (prestiti.containsKey(elemento)) {
            Membro membro = prestiti.remove(elemento);
            membro.decrementaPrestito();
            System.out.println("L'elemento " + elemento.getTitolo() + "è stato restituito " + membro.getNome());
            if (listeAttessa.containsKey(elemento) && !listeAttessa.get(elemento).isEmpty()) {
                Membro nextMembro = listeAttessa.get(elemento).poll();
                try {
                    prestaElemento(elemento, nextMembro);
                    System.out.println("Lelemento è stato prestato " + elemento.getTitolo());
                } catch (ElementoNonDisponibileException | LimitePrestitiRaggiuntoException e) {
                    System.out.println("C'è stato un errore durante il prestito " + e.getMessage());
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
}
