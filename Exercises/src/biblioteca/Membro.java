package biblioteca;

public class Membro {
    private String id;
    private String nome;
    private int prestitiCorrenti;
    public Membro(String id, String nome){
        this.id=id;
        this.nome=nome;
        this.prestitiCorrenti=0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPrestitoCorrente(){
        return prestitiCorrenti;
    }
    public void incrementaPrestito(){
        this.prestitiCorrenti++;
    }
    public void decrementaPrestito(){
        this.prestitiCorrenti--;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome " + nome + ",Prestiti Correnti: " + prestitiCorrenti;
    }
}
