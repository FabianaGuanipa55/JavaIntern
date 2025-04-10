package biblioteca;

public class Libro extends ElementoBiblioteca {
    private int isbn;
    public Libro(int isbn, String id, String titolo, String autore){
        super(id,titolo,autore);
        this.isbn=isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + isbn +
                '}';
    }
}
