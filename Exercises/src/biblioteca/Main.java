package biblioteca;

public class Main {
    public static void main(String[]args){
        Biblioteca biblioteca= new Biblioteca();

        //articoli della biblio
        biblioteca.articoli(new Rivista(334,"12345", "La rivista","Giuseppe Verdi"));
        biblioteca.articoli(new Libro(88888,"4567","Il libro due", "Anna Rossi"));
        biblioteca.articoli(new Libro(66666,"9876", "Libr0 3", "Angelo Neri"));
        biblioteca.articoli(new Rivista(336,"6789","La rivista II", "Marco Bianchi "));


        //membri
        Membro primo = new Membro("W123", "Augusto");
        Membro secondo = new Membro("Z456", "Vespasiano");
        Membro terzo = new Membro("H890", "Marco Aurelio");
        try{
            biblioteca.prestaElemento(biblioteca.getCatalogo().get(1), primo);
            biblioteca.prestaElemento(biblioteca.getCatalogo().get(2), primo);
            biblioteca.prestaElemento(biblioteca.getCatalogo().get(3), terzo);
        }catch (ElementoNonDisponibileException|LimitePrestitiRaggiuntoException e ){
            System.out.println("Errore durante il presttito " + e.getMessage());
        }
    }
}
