package biblioteca;

public abstract class ElementoBiblioteca {
    private String id;
    private String titolo;
    private String autore;
    public ElementoBiblioteca(String id, String titolo, String autore){
        this.id=id;
        this.titolo=titolo;
        this.autore=autore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "id='" + id + '\'' +
                ", titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                '}';
    }
}
