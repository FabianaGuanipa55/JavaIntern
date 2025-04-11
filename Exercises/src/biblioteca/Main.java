package biblioteca;

import java.util.HashSet;

public class Main {
    public static void main(String[]args){
        Biblioteca biblioteca= new Biblioteca();

        //Aggiungo articoli al catalogo
        biblioteca.aggiungiArticoli(new Rivista(334,"12345", "La rivista I","Giuseppe Verdi"));
        biblioteca.aggiungiArticoli(new Libro(88888,"4567","Il libro due", "Anna Rossi"));
        biblioteca.aggiungiArticoli(new Libro(66666,"9876", "Il libro tre ", "Angelo Neri"));
        biblioteca.aggiungiArticoli(new Rivista(336,"6789","La rivista II", "Marco Bianchi "));


        //Aggiungo i membri
        Membro primo = new Membro("W123", "Augusto");
        Membro secondo = new Membro("Z456", "Vespasiano");
        Membro terzo = new Membro("H890", "Marco Aurelio");

        biblioteca.stampoCatalogo();

        HashSet<String> autoriUnici=biblioteca.ottieniAutoriUnici();
        System.out.println("---------------------------Autori Unici----------------------------------");
        for(String autore: autoriUnici){
            System.out.println(autore);
        }


        //gestire i prestiti
        try{
            biblioteca.prestaElemento(biblioteca.getCatalogo().get(1), primo);
            biblioteca.prestaElemento(biblioteca.getCatalogo().get(2), primo);
            biblioteca.prestaElemento(biblioteca.getCatalogo().get(3), primo);
            biblioteca.prestaElemento(biblioteca.getCatalogo().get(3), terzo);
            biblioteca.prestaElemento(biblioteca.getCatalogo().get(1), secondo);
        }catch (ElementoNonDisponibileException|LimitePrestitiRaggiuntoException e ){
            System.out.println("----Errore durante il presttito " + e.getMessage());
        }
        biblioteca.stampaListaAttessa();

        try {
            biblioteca.restituisciElemento((biblioteca.getCatalogo().get(1)));
        }catch (ElementoNonDisponibileException e){
         System.out.println("----Errore durante la restituzione: " + e.getMessage());
        }


    }
}
