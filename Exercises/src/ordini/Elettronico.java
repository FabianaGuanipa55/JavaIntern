package ordini;

public class Elettronico extends Prodotto{
    int mesiGaranzia;
    public Elettronico(int mesiGaranzia, int id, String nome, double prezzo){
        super(id, nome, prezzo);
        this.mesiGaranzia=mesiGaranzia;
    }

    public int getMesiGaranzia() {
        return mesiGaranzia;
    }

    public void setMesiGaranzia(int mesiGaranzia) {
        this.mesiGaranzia = mesiGaranzia;
    }

    @Override
    public String toString() {
        return super.toString() + "Mesi di garanzia: " + mesiGaranzia;
    }
}
