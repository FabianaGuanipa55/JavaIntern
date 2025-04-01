package auto;

public class Veicolo {
    private int targa;
    private short oraArrivo;
    private short oraScadenza;

    public Veicolo(int targa, short oraArrivo, short oraScadenza) {
        this.targa = targa;
        this.oraArrivo = oraArrivo;
        this.oraScadenza = oraScadenza;
    }

    public int getTarga() {
        return targa;
    }

    public void setTarga(int targa) {
        this.targa = targa;
    }

    public short getOraArrivo() {
        return oraArrivo;
    }

    public void setOraArrivo(short oraArrivo) {
        this.oraArrivo = oraArrivo;
    }

    public short getOraScadenza() {
        return oraScadenza;
    }

    public void setOraScadenza(short oraScadenza) {
        this.oraScadenza = oraScadenza;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "targa=" + targa +
                ", oraArrivo=" + oraArrivo +
                ", oraScadenza=" + oraScadenza +
                '}';
    }
}