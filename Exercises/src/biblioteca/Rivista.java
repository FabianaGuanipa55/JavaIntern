package biblioteca;

public class Rivista extends ElementoBiblioteca {
    private int numeroEdizione;
    public Rivista(int numeroEdizione, String id, String titolo, String autore){
        super(id,titolo,autore);
        this.numeroEdizione=numeroEdizione;
    }

    public int getNumeroEdizione() {
        return numeroEdizione;
    }

    public void setNumeroEdizione(int numeroEdizione) {
        this.numeroEdizione = numeroEdizione;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "numeroEdizione=" + numeroEdizione +
                '}';
    }
}
